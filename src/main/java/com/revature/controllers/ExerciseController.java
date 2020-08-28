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
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Exercise;
import com.revature.services.ExerciseService;

@RestController
public class ExerciseController {
	@Autowired
	ExerciseService es;

	@RequestMapping(value = "/exercise", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Exercise addExercise(Exercise e) {
		return es.addExercise(e);
	}

	@GetMapping(value = "/exercise/{id}", produces = "application/json")
	public Exercise getExercise(@PathVariable("id") int id) {
		return es.getExercise(id);
	}

	@GetMapping(value = "/exercise/{name}")
	public Exercise findExercise(@PathVariable("name") String name) {
		return es.findByName(name);
	}

	@GetMapping(value = "/exercise")
	public List<Exercise> getAllExercises() {
		return es.getAllExercises();
	}

	@PutMapping(value = "/exercise/{id}", consumes = "application/json", produces = "application/json")
	public Exercise updateExercise(@PathVariable("id") int id, @RequestBody Exercise change) {
		change.setId(id);
		return es.updateExercise(change);
	}

	@DeleteMapping(value = "/exercise/{id}")
	public boolean deleteExercise(@PathVariable("id") int id) {
		return es.deleteExercise(es.getExercise(id));
	}
	

}
