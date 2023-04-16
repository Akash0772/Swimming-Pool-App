import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { SignupService } from './signup.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  owner: FormGroup;
  status: boolean = false;
  constructor(private service: SignupService, private formBuider: FormBuilder){
    this.owner = formBuider.group({
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
    return this.owner.get('id');
  }
  get firstName(){
    return this.owner.get('firstName');
  }
  get lastName(){
    return this.owner.get('lastName');
  }
  get mobileNumber(){
    return this.owner.get('mobileNumber');
  }
  get email(){
    return this.owner.get('email');
  }
  get password(){
    return this.owner.get('password');
  }
  get userType(){
    return this.owner.get('userType');
  }
  save(){
    // console.log(this.owner.value);
    // console.log(this.owner.value.userType);
    if(this.owner.invalid){
      this.owner.markAllAsTouched();
      return;
    }
    this.service.doSignup(this.owner).subscribe(
      r1 => {
        console.log(r1);
        this.status =true;
      }
    )
  }
}
