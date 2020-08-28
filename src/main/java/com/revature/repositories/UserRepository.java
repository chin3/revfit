package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;

import com.revature.beans.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	public User findByName(String name);

}
