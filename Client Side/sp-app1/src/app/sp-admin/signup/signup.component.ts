import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
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
      id: new FormControl(),
      firstName: new FormControl(),
      lastName: new FormControl(),
      mobileNumber: new FormControl(),
      email: new FormControl(),
      password: new FormControl()
    });
  }

  save(){
    this.service.doSignup(this.owner).subscribe(
      r1 => {
        console.log(r1);
        this.status =true;
      }
    )
  }
}
