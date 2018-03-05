package com.verifix.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="user_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	@Column(name="username")
    private String username;
	
	@Column(name="first_name")
    private String firstName;
	
	
	@Column(name="last_name")
    private String lastName;
	
	@Column(name="manager_id")
	private int managerId;
	
	@Column(name="role_group_id")
    private String roleGroupId;
	
	

	public int getUser_id() {
		return userId;
	}

	public void setUser_id(int user_id) {
		this.userId = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getRoleGroupId() {
		return roleGroupId;
	}

	public void setRoleGroupId(String roleGroupId) {
		this.roleGroupId = roleGroupId;
	}

	@Override
	public String toString() {
		return "User [user_id=" + userId + ", username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", managerId=" + managerId + ", roleGroupId=" + roleGroupId + "]";
	}

	public User(int user_id, String username, String firstName, String lastName, int managerId, String roleGroupId) {
		super();
		this.userId = user_id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.managerId = managerId;
		this.roleGroupId = roleGroupId;
	}
	
	
}