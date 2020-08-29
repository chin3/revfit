package com.revature.services;

import java.util.List;

import com.revature.beans.WorkoutExercise;

public interface WorkoutExerciseService {
	public WorkoutExercise addWorkoutExercise(WorkoutExercise e);
	public WorkoutExercise getWorkoutExercise(int workout_id, int exercise_id);
	public List<WorkoutExercise> getAllWorkoutExercises();
	public WorkoutExercise updateWorkoutExercise(WorkoutExercise change);
	public boolean deleteWorkoutExercise(WorkoutExercise e);
}
