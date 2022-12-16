package com.luv2code.springboot.cruddemo.dao;

import java.util.List;
import com.luv2code.springboot.cruddemo.entity.Personaje;

public interface PersonajeDAO {

	List<Personaje> findAll();
	
	Personaje findById(int theId);
	
	void save(Personaje thePersonaje);
	
	void deleteById(int theId);
	
}
