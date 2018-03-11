package com.verifix.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credentials")
public class Credentials {
	
	public Credentials() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	@Id
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
