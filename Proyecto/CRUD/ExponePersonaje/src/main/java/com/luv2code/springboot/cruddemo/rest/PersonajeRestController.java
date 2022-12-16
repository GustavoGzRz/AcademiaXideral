package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Personaje;
import com.luv2code.springboot.cruddemo.service.PersonajeService;

@RestController
@RequestMapping("/rest")//contexto/rest/personajes
public class PersonajeRestController {

	private PersonajeService personajeService;
	
	@Autowired
	public PersonajeRestController(PersonajeService thePersonajeService) {
		personajeService = thePersonajeService;
	}
	
	// expose "/personajes" and return list of personajes
	@GetMapping("/personajes")
	public List<Personaje> findAll() {
		return personajeService.findAll();
	}

	// add mapping for GET /personajes/{personajeId}
	
	@GetMapping("/personajes/{personajeId}")
	public Personaje getPersonaje(@PathVariable int personajeId) throws Exception {
		
		Personaje thePersonaje = personajeService.findById(personajeId);
		
		if (thePersonaje == null) {
			throw new Exception("Personaje id not found - " + personajeId);
		}
		
		return thePersonaje;
	}
	
	// add mapping for POST /personajes - add new personaje
	
	@PostMapping("/personajes")
	public Personaje addPersonaje(@RequestBody Personaje thePersonaje) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		thePersonaje.setId(0);
		
		personajeService.save(thePersonaje);
		
		return thePersonaje;
	}
	
	// add mapping for PUT /personajes - update existing employee
	
	@PutMapping("/personajes")
	public Personaje updatePersonaje(@RequestBody Personaje thePersonaje) {
		
		personajeService.save(thePersonaje);
		
		return thePersonaje;
	}
	
	// add mapping for DELETE /personajes/{employeeId} - delete employee
	
	@DeleteMapping("/personajes/{personajeId}")
	public String deletePersonaje(@PathVariable int personajeId) {
		
		Personaje tempPersonaje = personajeService.findById(personajeId);
		
		// throw exception if null
		
		if (tempPersonaje == null) {
			throw new RuntimeException("Personaje id not found - " + personajeId);
		}
		
		personajeService.deleteById(personajeId);
		
		return "Deleted personaje id - " + personajeId;
	}
	
}










