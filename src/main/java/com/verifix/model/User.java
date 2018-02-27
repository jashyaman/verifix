package com.verifix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String uid;
	
	@Column
    private String username;
	
	@Column
    private String role_group;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole_group() {
		return role_group;
	}
	public void setRole_group(String role_group) {
		this.role_group = role_group;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", role_group=" + role_group + "]";
	}
	public User(String uid, String username, String role_group) {
		super();
		this.uid = uid;
		this.username = username;
		this.role_group = role_group;
	}
    
    
     
}