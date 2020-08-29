package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "workout_exercise")
public class WorkoutExercise {
	
	@ManyToOne
	@JoinColumn(name = "workout_id")
	private Workout workout;
	
	@ManyToOne
	@JoinColumn(name = "exercise_id")
	private Exercise exercise;
	
	@Column(columnDefinition = "NUMBER(10, 3)")
	private double time;
	private int sets;
	
	public WorkoutExercise() {
		super();
	}

	public WorkoutExercise(Workout workout, Exercise exercise, double time, int sets) {
		super();
		this.workout = workout;
		this.exercise = exercise;
		this.time = time;
		this.sets = sets;
	}

	public Workout getWorkout() {
		return workout;
	}

	public void setWorkout(Workout workout) {
		this.workout = workout;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exercise == null) ? 0 : exercise.hashCode());
		result = prime * result + sets;
		long temp;
		temp = Double.doubleToLongBits(time);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((workout == null) ? 0 : workout.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorkoutExercise other = (WorkoutExercise) obj;
		if (exercise == null) {
			if (other.exercise != null)
				return false;
		} else if (!exercise.equals(other.exercise))
			return false;
		if (sets != other.sets)
			return false;
		if (Double.doubleToLongBits(time) != Double.doubleToLongBits(other.time))
			return false;
		if (workout == null) {
			if (other.workout != null)
				return false;
		} else if (!workout.equals(other.workout))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WorkoutExercise [workout=" + workout + ", exercise=" + exercise + ", time=" + time + ", sets=" + sets
				+ "]";
	}
	
}
