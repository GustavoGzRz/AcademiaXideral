package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Personaje;

public interface PersonajeService {

	public List<Personaje> findAll();
	
	public Personaje findById(int theId);
	
	public void save(Personaje thePersonaje);
	
	public void deleteById(int theId);
	
}
