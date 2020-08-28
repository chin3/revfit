import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginregisterComponent } from './loginregister/loginregister.component';

const routes: Routes = [
{path : 'loginregister', component: LoginregisterComponent},
{path : '', redirectTo: 'loginregister', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
