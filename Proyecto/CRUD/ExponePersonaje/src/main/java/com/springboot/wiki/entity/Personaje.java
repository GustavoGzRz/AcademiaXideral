package com.springboot.wiki.entity;
import lombok.*;
import javax.persistence.*;

@Data 
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name="personaje")
public class Personaje {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="occupation")
	private String occupation;
	
	@Column(name="role")
	private String role;
	
}











