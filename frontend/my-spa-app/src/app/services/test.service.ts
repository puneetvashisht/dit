import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TestService {

  constructor(private httpClient: HttpClient) { }

  fetchSomeData(){
    this.httpClient.get('http://localhost:8000/dummyUrl')
  }

}
