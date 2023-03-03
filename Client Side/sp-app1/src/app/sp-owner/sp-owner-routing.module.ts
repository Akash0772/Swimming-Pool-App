import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { ListBookingSpsComponent } from './list-booking-sps/list-booking-sps.component';
import { ListMySpsComponent } from './list-my-sps/list-my-sps.component';

const routes: Routes = [
  {path: 'add-sp', component: AddComponent},
  {path: 'list-my-sps', component: ListMySpsComponent},
  {path: 'list-booking-sps', component: ListBookingSpsComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SpOwnerRoutingModule { }
