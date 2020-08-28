package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Exercise;
import com.revature.repositories.ExerciseRepository;

@Service
public class ExerciseServiceImpl implements ExerciseService{
	
	@Autowired
	ExerciseRepository er;

	@Override
	public Exercise addExercise(Exercise e) {
		return er.save(e);
	}

	@Override
	public Exercise getExercise(int id) {
		return er.findById(id).get();
	}

	@Override
	public Exercise findByName(String name) {
		return er.findByName(name);
	}

	@Override
	public List<Exercise> getAllExercises() {
		return (List<Exercise>) er.findAll();
	}

	@Override
	public Exercise updateExercise(Exercise change) {
		return er.save(change);
	}

	@Override
	public boolean deleteExercise(Exercise e) {
		try {
			er.delete(e);
			return true;
		} catch (IllegalArgumentException er) {
			er.printStackTrace();
			return false;
		}
	}
}
