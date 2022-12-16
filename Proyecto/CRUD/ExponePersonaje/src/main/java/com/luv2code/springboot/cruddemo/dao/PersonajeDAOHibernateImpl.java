package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Personaje;

@Repository
public class PersonajeDAOHibernateImpl implements PersonajeDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public PersonajeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<Personaje> findAll() {
		System.out.println("PersonajeDAOHibernateImpl");
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Personaje> theQuery =
				currentSession.createQuery("from Personaje", Personaje.class);
		
		// execute query and get result list
		List<Personaje> personajes = theQuery.getResultList();
		
		// return the results		
		return personajes;
	}


	@Override
	public Personaje findById(int theId) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// get the employee
		Personaje thePersonaje =
				currentSession.get(Personaje.class, theId);
		
		// return the employee
		return thePersonaje;
	}


	@Override
	public void save(Personaje thePersonaje) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// save employee
		currentSession.saveOrUpdate(thePersonaje);
	}


	@Override
	public void deleteById(int theId) {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery(
						"delete from Personaje where id=:personajeId");
		
		theQuery.setParameter("personajeId", theId);
		
		theQuery.executeUpdate();
	}

}







