package com.verifix.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.verifix.models.Role;

@Repository
public class RoleRoleGroupUserDao extends AbstractDao {

	//select role.role_name from user join role_group using 
	//(role_group_id) join role using (role_id) where user_id = '102';
	public List<Role> findUserRoles(String userid) {
		String hql = "SELECT R.roleName from User U JOIN RoleGroup RG ON RG.roleGroupId = U.roleGroupId "
				+ " JOIN Role R ON RG.roleId = R.roleId";
		Query query = getSession().createSQLQuery(hql);
		return query.list();
	}

	
}
