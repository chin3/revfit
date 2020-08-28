import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ModalModule } from 'ngx-bootstrap/modal';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginregisterComponent } from './loginregister/loginregister.component';
import { WorkoutsComponent } from './workouts/workouts.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginregisterComponent,
    WorkoutsComponent
  ],
  imports: [
    ModalModule,
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
