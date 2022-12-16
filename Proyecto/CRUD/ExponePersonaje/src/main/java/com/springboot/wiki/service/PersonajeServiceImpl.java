package com.springboot.wiki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.wiki.dao.PersonajeDAO;
import com.springboot.wiki.entity.Personaje;

@Service
public class PersonajeServiceImpl implements PersonajeService {

	
	private PersonajeDAO personajeDAO;
	
	@Autowired
	public PersonajeServiceImpl(@Qualifier("personajeDAOJdbcImpl") PersonajeDAO thePersonajeDAO) {
		personajeDAO = thePersonajeDAO;
	}
	
	@Override
	@Transactional
	public List<Personaje> findAll() {
		return personajeDAO.findAll();
	}

	@Override
	@Transactional
	public Personaje findById(int theId) {
		return personajeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Personaje thePersonaje) {
		personajeDAO.save(thePersonaje);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		personajeDAO.deleteById(theId);
	}

}






