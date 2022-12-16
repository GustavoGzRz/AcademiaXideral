package com.luv2code.springboot.cruddemo.dao;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Personaje;

@Repository
public class PersonajeDAOJdbcImpl implements PersonajeDAO {

	@Autowired
	DataSource dataSource;

	@Override
	public List<Personaje> findAll() {
		System.out.println("Implementación DAO con JDBC findAll(): " + dataSource);

		List<Personaje> listaPersonajes = new ArrayList<>();

		String sql = "select * from personaje";

		try (Connection myConn = dataSource.getConnection();
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery(sql);) {

			// process result set
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String nationality = myRs.getString("nationality");
				String occupation = myRs.getString("occupation");
				String role = myRs.getString("role");

				// create new personaje object
				Personaje tempPersonaje = new Personaje(id, firstName, lastName, nationality, occupation, role);

				// add it to the list of personajes
				listaPersonajes.add(tempPersonaje);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaPersonajes;
	}

	@Override
	public Personaje findById(int theId) {
		
		System.out.println("Implementación DAO con JDBC findById(): ");
		Personaje thePersonaje = null;

		try (Connection myConn = dataSource.getConnection();
			PreparedStatement myStmt = createPreparedStatement(myConn, theId);
			ResultSet myRs = myStmt.executeQuery();) {

			// retrieve data from result set row
			if (myRs.next()) {
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String nationality = myRs.getString("nationality");
				String occupation = myRs.getString("occupation");
				String role = myRs.getString("role");

				// use the studentId during construction
				thePersonaje = new Personaje(theId, firstName, lastName, nationality, occupation, role);
			} else {
				throw new SQLException("No se pudo encontrar al personaje con id: " + theId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return thePersonaje;
	}

	private PreparedStatement createPreparedStatement(Connection con, int personajeId) throws SQLException {
		String sql = "select * from personaje where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, personajeId);
		return ps;
	}

	@Override
	public void save(Personaje thePersonaje) {
		String sql = "";

		if (thePersonaje.getId() == 0)
			sql = "insert into personaje (first_name, last_name, nationality, occupation, role) values (?, ?, ?, ?, ?)";
		else
			sql = "update personaje set first_name=?, last_name=?, nationality=?, occupation=?, role=? where id=?";

		try (Connection myConn = dataSource.getConnection();
			 PreparedStatement myStmt = myConn.prepareStatement(sql)) {

			myStmt.setString(1, thePersonaje.getFirstName());
			myStmt.setString(2, thePersonaje.getLastName());
			myStmt.setString(3, thePersonaje.getNationality());
			myStmt.setString(4, thePersonaje.getOccupation());
			myStmt.setString(5, thePersonaje.getRole());

			if (thePersonaje.getId() != 0)
				myStmt.setInt(6, thePersonaje.getId());

			myStmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteById(int theId) {
		
		try (Connection myConn = dataSource.getConnection(); 
			 PreparedStatement myStmt = myConn.prepareStatement("delete from personaje where id=?")) {
			
			myStmt.setInt(1, theId);
			myStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
