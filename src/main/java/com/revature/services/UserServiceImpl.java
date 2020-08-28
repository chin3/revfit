package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.User;
import com.revature.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository er;

	@Override
	public User addUser(User e) {
		return er.save(e);
	}

	@Override
	public User getUser(int id) {
		return er.findById(id).get();
	}

	@Override
	public User findByName(String name) {
		return er.findByName(name);
	}

	@Override
	public List<User> getAllUsers() {
		return (List<User>) er.findAll();
	}

	@Override
	public User updateUser(User change) {
		return er.save(change);
	}

	@Override
	public boolean deleteUser(User e) {
		try {
			er.delete(e);
			return true;
		} catch (IllegalArgumentException er) {
			er.printStackTrace();
			return false;
		}
	}
}
