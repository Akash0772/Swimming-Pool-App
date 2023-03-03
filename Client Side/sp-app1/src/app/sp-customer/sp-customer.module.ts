import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SpCustomerRoutingModule } from './sp-customer-routing.module';
import { SearchSpComponent } from './search-sp/search-sp.component';
import { BookSpComponent } from './book-sp/book-sp.component';
import { MyBookingComponent } from './my-booking/my-booking.component';


@NgModule({
  declarations: [
    SearchSpComponent,
    BookSpComponent,
    MyBookingComponent
  ],
  imports: [
    CommonModule,
    SpCustomerRoutingModule
  ]
})
export class SpCustomerModule { }
