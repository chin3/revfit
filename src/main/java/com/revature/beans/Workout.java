package com.revature.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "workout")
public class Workout {

	@Id
	@GeneratedValue
	@Column(name = "workout_id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
			name = "workout_exercise", 
			joinColumns = { @JoinColumn(name = "workout_id") }, 
			inverseJoinColumns = { @JoinColumn(name = "exercise_id") }
	)
	private List<Exercise> exercises;

	private String intensity;
	private String type;

	public Workout(int id, User user, String intensity, String type, List<Exercise> exercises) {
		super();
		this.id = id;
		this.user = user;
		this.intensity = intensity;
		this.type = type;
		this.exercises = exercises;
	}

	public Workout(User user, String intensity, String type, List<Exercise> exercises) {
		super();
		this.user = user;
		this.intensity = intensity;
		this.type = type;
		this.exercises = exercises;
	}

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public Workout() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getIntensity() {
		return intensity;
	}

	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Workout [id=" + id + ", user=" + user + ", exercises=" + exercises + ", intensity=" + intensity
				+ ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exercises == null) ? 0 : exercises.hashCode());
		result = prime * result + id;
		result = prime * result + ((intensity == null) ? 0 : intensity.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Workout other = (Workout) obj;
		if (exercises == null) {
			if (other.exercises != null)
				return false;
		} else if (!exercises.equals(other.exercises))
			return false;
		if (id != other.id)
			return false;
		if (intensity == null) {
			if (other.intensity != null)
				return false;
		} else if (!intensity.equals(other.intensity))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
