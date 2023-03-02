import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SpAdminRoutingModule } from './sp-admin-routing.module';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';


@NgModule({
  declarations: [
    SignupComponent,
    LoginComponent,
    ForgotPasswordComponent
  ],
  imports: [
    CommonModule,
    SpAdminRoutingModule
  ]
})
export class SpAdminModule { }
