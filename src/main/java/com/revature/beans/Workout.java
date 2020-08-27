package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Workout {

	@Id
	@GeneratedValue
	@Column(name = "workout_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "total_time")
	private double totalTime;
	private String intensity;
	private String type;
	
	public Workout(int id, User user, double totalTime, String intensity, String type) {
		super();
		this.id = id;
		this.user = user;
		this.totalTime = totalTime;
		this.intensity = intensity;
		this.type = type;
	}
	
	public Workout(User user, double totalTime, String intensity, String type) {
		super();
		this.user = user;
		this.totalTime = totalTime;
		this.intensity = intensity;
		this.type = type;
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

	public double getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
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
		return "Workout [id=" + id + ", user=" + user + ", totalTime=" + totalTime + ", intensity=" + intensity
				+ ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((intensity == null) ? 0 : intensity.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalTime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (id != other.id)
			return false;
		if (intensity == null) {
			if (other.intensity != null)
				return false;
		} else if (!intensity.equals(other.intensity))
			return false;
		if (Double.doubleToLongBits(totalTime) != Double.doubleToLongBits(other.totalTime))
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
