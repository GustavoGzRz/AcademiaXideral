package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.Personaje;

public interface PersonajeService {

	public List<Personaje> getPersonajes();

	public void savePersonaje(Personaje thePersonaje);

	public Personaje getPersonaje(int theId);

	public void deletePersonaje(int theId);
	
}
