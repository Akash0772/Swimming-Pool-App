import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { SignupService } from './signup.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  user: FormGroup;
  status: boolean = false;
  constructor(private service: SignupService, private formBuider: FormBuilder){
    this.user = formBuider.group({
      id: new FormControl('', Validators.required),
      firstName: new FormControl('', Validators.required),
      lastName: new FormControl('', Validators.required),
      mobileNumber: new FormControl('', Validators.required),
      email: new FormControl('', Validators.required),
      password: new FormControl('', Validators.required),
      userType: new FormControl('', Validators.required)
    });
  }

  get id(){
    return this.user.get('id');
  }
  get firstName(){
    return this.user.get('firstName');
  }
  get lastName(){
    return this.user.get('lastName');
  }
  get mobileNumber(){
    return this.user.get('mobileNumber');
  }
  get email(){
    return this.user.get('email');
  }
  get password(){
    return this.user.get('password');
  }
  get userType(){
    return this.user.get('userType');
  }
  save(){
    // console.log(this.owner.value);
    // console.log(this.owner.value.userType);
    if(this.user.invalid){
      this.user.markAllAsTouched();
      return;
    }
    this.service.doSignup(this.user).subscribe(
      r1 => {
        console.log(r1);
        this.status =true;
      }
    )
  }
}
