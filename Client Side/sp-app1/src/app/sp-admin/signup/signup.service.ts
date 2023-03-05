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
    return this.httpclient.post<any>(this.url + "/owner", owner.value);
  }
}
