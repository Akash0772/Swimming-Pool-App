import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SpAdminRoutingModule } from './sp-admin-routing.module';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { MyprofileComponent } from './myprofile/myprofile.component';
import { LogoutComponent } from './logout/logout.component';
import { ChangePasswordComponent } from './change-password/change-password.component';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    SignupComponent,
    LoginComponent,
    ForgotPasswordComponent,
    MyprofileComponent,
    LogoutComponent,
    ChangePasswordComponent
  ],
  imports: [
    CommonModule,
    SpAdminRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ]
})
export class SpAdminModule { }
