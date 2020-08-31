import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http';
import {User} from '../model/User';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private headers = new HttpHeaders({'Content-Type':'application/json'});

  constructor(private http: HttpClient) { }

  loginUser(username, password){
    return this.http.post<User>('http://localhost:8080/user/login',{"username": username , "password":password},{headers: this.headers});
  }

}
