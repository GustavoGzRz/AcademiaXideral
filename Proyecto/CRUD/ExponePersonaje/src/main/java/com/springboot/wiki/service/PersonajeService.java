package com.springboot.wiki.service;

import java.util.List;

import com.springboot.wiki.entity.Personaje;

public interface PersonajeService {

	public List<Personaje> findAll();
	
	public Personaje findById(int theId);
	
	public void save(Personaje thePersonaje);
	
	public void deleteById(int theId);
	
}
