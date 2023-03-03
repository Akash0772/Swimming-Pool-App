import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SpCommonRoutingModule } from './sp-common-routing.module';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SpAdminModule } from '../sp-admin/sp-admin.module';
import { SpOwnerModule } from '../sp-owner/sp-owner.module';
import { SpCustomerModule } from '../sp-customer/sp-customer.module';
// import { SpAdminModule } from '../sp-admin/sp-admin.module';


@NgModule({
  declarations: [
    HeaderComponent,
    FooterComponent
  ],
  exports : [
      HeaderComponent,
      FooterComponent
  ],
  imports: [
    CommonModule,
    SpCommonRoutingModule,
    SpAdminModule,
    SpOwnerModule,
    SpCustomerModule,
  ]
})
export class SpCommonModule { }
