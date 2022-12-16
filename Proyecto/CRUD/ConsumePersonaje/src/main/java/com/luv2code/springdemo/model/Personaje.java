package com.luv2code.springdemo.model;

public class Personaje {

	private int id;
	private String firstName;
	private String lastName;	
	private String nationality;
	private String occupation;
	private String role;
	
	public Personaje() {
	}

	public Personaje(String firstName, String lastName, String nationality, String occupation, String role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		this.occupation = occupation;
		this.role = role;
	}

	public Personaje(int id,String firstName, String lastName, String nationality, String occupation, String role) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		this.occupation = occupation;
		this.role = role;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Personaje [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", nationality="
				+ nationality + ", occupation=" + occupation + ", role=" + role + "]";
	}


		
}











