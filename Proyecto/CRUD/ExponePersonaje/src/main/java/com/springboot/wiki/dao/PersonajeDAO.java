package com.springboot.wiki.dao;
import java.util.List;
import com.springboot.wiki.entity.Personaje;

public interface PersonajeDAO {

	List<Personaje> findAll();
	
	Personaje findById(int theId);
	
	void save(Personaje thePersonaje);
	
	void deleteById(int theId);
	
}
