import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SpOwnerRoutingModule } from './sp-owner-routing.module';
import { AddComponent } from './add/add.component';
import { ListMySpsComponent } from './list-my-sps/list-my-sps.component';
import { ListBookingSpsComponent } from './list-booking-sps/list-booking-sps.component';


@NgModule({
  declarations: [
    AddComponent,
    ListMySpsComponent,
    ListBookingSpsComponent
  ],
  imports: [
    CommonModule,
    SpOwnerRoutingModule
  ]
})
export class SpOwnerModule { }
