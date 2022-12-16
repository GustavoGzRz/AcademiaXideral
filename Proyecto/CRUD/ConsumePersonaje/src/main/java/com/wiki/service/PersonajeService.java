package com.wiki.service;

import java.util.List;

import com.wiki.model.Personaje;

public interface PersonajeService {

	public List<Personaje> getPersonajes();

	public void savePersonaje(Personaje thePersonaje);

	public Personaje getPersonaje(int theId);

	public void deletePersonaje(int theId);
	
}
