import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChangePasswordComponent } from './change-password/change-password.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { MyprofileComponent } from './myprofile/myprofile.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
    {path: "signup", component: SignupComponent},
    {path: "login", component: LoginComponent},
    {path: "forgot-password", component: ForgotPasswordComponent},
    {path: "myprofile", component: MyprofileComponent},
    {path: "logout", component: LogoutComponent},
    {path: "change-password", component: ChangePasswordComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SpAdminRoutingModule { }
