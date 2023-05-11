import { Component } from '@angular/core';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
    login: FormGroup;
    status: any;
    constructor(formBuilder : FormBuilder){
      this.login = formBuilder.group({
        username: new FormControl('', Validators.required),
        password: new FormControl('', Validators.required)
      })
    }

    save(){
      var username = this.login.value.username;
      var role = (username == 'a@a.com') ? 'owner' : 'customer';
      this.status = true;
      sessionStorage.setItem('username' , username);
      sessionStorage.setItem('role' , role);
    }
}


