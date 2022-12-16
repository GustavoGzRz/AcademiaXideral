package com.wiki.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wiki.model.Personaje;

@Service
public class PersonajeServiceRestClientImpl implements PersonajeService {

	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public PersonajeServiceRestClientImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url}") String theUrl) {
		
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	@Override
	public List<Personaje> getPersonajes() {
		
		logger.info("***OBTENER LISTA DE PERSONAJES DESDE EL SERVICE REST CLIENTE");
		logger.info("in getPersonajes(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<Personaje>> responseEntity = 
											restTemplate.exchange(crmRestUrl, HttpMethod.GET, null, 
													 new ParameterizedTypeReference<List<Personaje>>() {});

		// get the list of personajes from response
		List<Personaje> personajes = responseEntity.getBody();

		logger.info("in getPersonajes(): personajes" + personajes);
		
		return personajes;
	}

	@Override
	public Personaje getPersonaje(int theId) {
		logger.info("***OBTENER UN Personaje DESDE EL SERVICE REST CLIENTE");

		logger.info("in getPersonaje(): Calling REST API " + crmRestUrl);

		// make REST call
		Personaje thePersonaje = 
				restTemplate.getForObject(crmRestUrl + "/" + theId, 
						Personaje.class);

		logger.info("in savePersonaje(): thePersonaje=" + thePersonaje);
		
		return thePersonaje;
	}

	@Override
	public void savePersonaje(Personaje thePersonaje) {

		logger.info("in savePersonaje(): Calling REST API " + crmRestUrl);
		
		int personajeId = thePersonaje.getId();

		// make REST call
		if (personajeId == 0) {
			// add personaje
			logger.info("***SALVAR UN PERSONAJE DESDE EL SERVICE REST CLIENTE");

			restTemplate.postForEntity(crmRestUrl, thePersonaje, String.class);			
		
		} else {
			// update personaje
			logger.info("***ACTUALIZAR UN Personaje DESDE EL SERVICE REST CLIENTE");

			restTemplate.put(crmRestUrl, thePersonaje);
		}

		logger.info("in savePersonaje(): success");	
	}

	@Override
	public void deletePersonaje(int theId) {
		logger.info("***BORRAR UN Personaje DESDE EL SERVICE REST CLIENTE");

		logger.info("in deletePersonaje(): Calling REST API " + crmRestUrl);

		// make REST call
		restTemplate.delete(crmRestUrl + "/" + theId);

		logger.info("in deletePersonaje(): deleted personaje theId=" + theId);
	}

}
