import { Component, OnInit } from '@angular/core';
import {Workout} from 'src/app/model/Workout';
import { User } from 'src/app/model/User';
import {WorkoutService} from 'src/app/services/workout.service';

const STORAGE_KEY = 'USER';
@Component({
  selector: 'app-workoutdash',
  templateUrl: './workoutdash.component.html',
  styleUrls: ['./workoutdash.component.css']
})
export class WorkoutdashComponent implements OnInit {
  ngOnInit(): void {
    this.user= JSON.parse(sessionStorage.getItem(STORAGE_KEY));
    this.getUserWorkouts(this.user);
  }

  constructor(private workoutService: WorkoutService){
  }
  userWorkouts: Workout[]
  user : User;

  getUserWorkouts(u:User){
    this.workoutService.getUserWorkouts(u).subscribe(
      (response)=>{console.log(response)},
      (response)=>{console.log('failed')},
      ()=>{console.log('Woop') }
    
      );
    
  }





}
