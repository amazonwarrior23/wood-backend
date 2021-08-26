package com.woodapp.users;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="user_data")
public class RegisteredUsers {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
	@NotNull(message = "First name cannot be null")
	public String firstName;
	
	@NotNull(message = "Last name cannot be null")
	public String lastName;
	
	@Email(message = "Must use a valid email")
	public String email;
	
	@NotNull
	@Size(min=6, max=20, message = "Password must be between 6-20 characters")
	public String password;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}