package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.User;
import com.revature.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService us;
	
	@RequestMapping(value = "/User", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public User addUser(@RequestBody User u) {
		return us.addUser(u);
	}
	
	@GetMapping(value = "/User", produces = "application/json")
	public List<User> allUser() {
		return us.getAllUsers();
	}
	
	@GetMapping(value = "User/{id}")
	public User getUser(@PathVariable("id") int id) {
		return us.getUser(id);
	}
	
	@GetMapping(value = "/User/search")
	public User findUser(@RequestParam(required = false) String username) {
		
		if(username != null) {
			return us.findByUsername(username);
		}
		
		return null;
	}
	
	@PutMapping(value = "/User/{id}", consumes = "application/json")
	public User updateUser(@PathVariable("id") int id, @RequestBody User change) {
		change.setId(id);
		return us.updateUser(change);
	}
	
	@DeleteMapping(value = "/User/{id}")
	public boolean deleteUser(@PathVariable("id") int id) {
		return us.deleteUser(us.getUser(id));
	}
}
