package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;

import com.revature.beans.Exercise;

public interface ExerciseRepository extends CrudRepository<Exercise, Integer>{
	public Exercise findByName(String name);
}
