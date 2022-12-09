package com.luv2code.web.jdbc;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private int credential;
	private String status;
	

	public Student(String firstName, String lastName, String email, int credential, String status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.credential = credential;
		this.status = status;
		
	}

	public Student(int id, String firstName, String lastName, String email, int credential, String status) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.credential = credential;
		this.status = status;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getCredential() {
		return credential;
	}

	public void setCredential(int credential) {
		this.credential = credential;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", credential=" + credential + ", status=" + status + "]";
	}
	
	
}
