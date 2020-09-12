import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(httpClient: HttpClient) {
  }
    public boolean validateLogin(){
    return true;
  }
}
