package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.WorkoutExercise;

@Repository
public interface WorkoutExerciseRepository extends CrudRepository<WorkoutExercise, Integer>{

}
