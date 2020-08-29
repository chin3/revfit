import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginregisterComponent } from './components/loginregister/loginregister.component';
import { HomeComponent } from './components/home/home.component';
import { HomedashComponent } from './components/dashboardcomponents/homedash/homedash.component';


const routes: Routes = [
{path : 'loginregister', component: LoginregisterComponent},
{path : '', redirectTo: 'loginregister', pathMatch: 'full'},
{path : 'home', component: HomeComponent},
{path: 'dash', component: HomedashComponent, outlet:"dashboard"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
