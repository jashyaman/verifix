package com.verifix.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role_group")
public class RoleGroup {

	public RoleGroup() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_group_id")
	private int roleGroupId;
	
	@Column(name="role_group_name")
	private String roleGroupName;
	
	@Column(name="role_id")
	private int roleId;

	public int getRoleGroupId() {
		return roleGroupId;
	}

	public void setRoleGroupId(int roleGroupId) {
		this.roleGroupId = roleGroupId;
	}

	public String getRoleGroupName() {
		return roleGroupName;
	}

	public void setRoleGroupName(String roleGroupName) {
		this.roleGroupName = roleGroupName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public RoleGroup(int roleGroupId, String roleGroupName, int roleId) {
		super();
		this.roleGroupId = roleGroupId;
		this.roleGroupName = roleGroupName;
		this.roleId = roleId;
	}
	
	
}
