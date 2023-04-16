import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SignupService {
  url: string = 'http://localhost:9090';
  constructor(private httpclient: HttpClient) { 

  }

  doSignup(owner: any){
    var signupUrl = this.url
    if(owner.value.userType == 'owner'){
      signupUrl += '/owner';
    }
    else
    {
      signupUrl += '/customer';
    }
    return this.httpclient.post<any>(signupUrl, owner.value);
  }
}
