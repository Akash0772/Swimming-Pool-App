import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  isLoggedIn(){
    var username = sessionStorage.getItem('username');
    var status = false;
    if(username){
      status = true;
    }
    return status;
  }

  isOwner(){
    var role = sessionStorage.getItem('role');
    return role == 'owner';
  }

  isCustomer(){
    var role = sessionStorage.getItem('role');
    return role == 'customer';
  }
}
