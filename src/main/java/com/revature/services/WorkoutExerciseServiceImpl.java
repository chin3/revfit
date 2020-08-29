package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.beans.WorkoutExercise;
import com.revature.repositories.WorkoutExerciseRepository;

public class WorkoutExerciseServiceImpl implements WorkoutExerciseService {

	@Autowired
	WorkoutExerciseRepository wer;
	
	@Override
	public WorkoutExercise addWorkoutExercise(WorkoutExercise e) {
		return wer.save(e);
	}

	@Override
	public WorkoutExercise getWorkoutExercise(int workout_id, int exercise_id) {
		return null;
	}

	@Override
	public List<WorkoutExercise> getAllWorkoutExercises() {
		return (List<WorkoutExercise>) wer.findAll();
	}

	@Override
	public WorkoutExercise updateWorkoutExercise(WorkoutExercise change) {
		return wer.save(change);
	}

	@Override
	public boolean deleteWorkoutExercise(WorkoutExercise e) {
		try {
			wer.delete(e);
			return true;
		} catch (IllegalArgumentException er) {
			er.printStackTrace();
			return false;
		}
	}

}
