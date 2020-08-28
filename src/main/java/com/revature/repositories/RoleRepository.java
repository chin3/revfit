package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;

import com.revature.beans.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
	
	public Role findByName(String name);

}
