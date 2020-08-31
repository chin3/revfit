import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ModalModule } from 'ngx-bootstrap/modal';
import { AppRoutingModule } from './app-routing.module';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {FormsModule} from '@angular/forms'
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { LoginregisterComponent } from './components/loginregister/loginregister.component';
import { WorkoutsComponent } from './components/workouts/workouts.component';
import { HomeComponent } from './components/home/home.component';
import { HomedashComponent } from './components/dashboardcomponents/homedash/homedash.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginregisterComponent,
    WorkoutsComponent,
    HomeComponent,
    HomedashComponent,
  ],
  imports: [
    ModalModule,
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
