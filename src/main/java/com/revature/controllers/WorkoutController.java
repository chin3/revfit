package com.revature.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.User;
import com.revature.beans.Workout;
import com.revature.services.WorkoutService;

@RestController
public class WorkoutController {

	@Autowired
	WorkoutService ws;

	@PostMapping(value = "/workout", consumes = "application/json", produces = "application/json")
	public Workout addWorkout(@RequestBody Workout w) {
		return ws.addWorkout(w);
	}

	@GetMapping(value = "/workout/{idOrIntensity}", produces = "application/json")
	public List<Workout> getWorkout(@PathParam("idOrIntensity") String idOrIntensity, @RequestBody(required = false) User u) {
		if(u == null) {
			try {
				int id = Integer.parseInt(idOrIntensity);
				return new ArrayList<Workout>(Arrays.asList(ws.getWorkout(id)));
			} catch(NumberFormatException e) {
				return ws.getWorkoutsByIntensity(idOrIntensity);
			}
		}
		else {
			return ws.getWorkoutsByUser(u.getId());
		}
		
	}

	@GetMapping(value = "/workout", produces = "application/json")
	public List<Workout> getAllWorkouts() {
		return ws.getAllWorkouts();
	}
	

	@PutMapping(value = "/workout/{id}", produces = "application/json")
	public Workout updateWorkout(@PathParam("id") int id, @RequestBody Workout change) {
		change.setId(id);
		return ws.updateWorkout(change);
	}

	@DeleteMapping(value = "/workout/{id}")
	public boolean deleteWorkout(@PathParam("id") int id) {
		return ws.deleteWorkout(ws.getWorkout(id));
	}
	
	
	
}
