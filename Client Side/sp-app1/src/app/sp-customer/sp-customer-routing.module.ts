import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookSpComponent } from './book-sp/book-sp.component';
import { MyBookingComponent } from './my-booking/my-booking.component';
import { SearchSpComponent } from './search-sp/search-sp.component';

const routes: Routes = [
  {path: 'search-sp', component: SearchSpComponent },
  {path: 'book-sp', component: BookSpComponent},
  {path: 'my-booking', component: MyBookingComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SpCustomerRoutingModule { }
