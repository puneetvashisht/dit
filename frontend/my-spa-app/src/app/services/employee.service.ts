import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const baseUrl = 'http://localhost:8000/api/employee/'
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http: HttpClient) { }

  fetchAllEmployees(){
    return this.http.get(baseUrl);
  }

  addEmployee(name: string, salary: number){
    return this.http.post(baseUrl, 
      {name: name, salary: salary},{observe : 'response'})

  }

  deleteEmployee(id: number){
    return this.http.delete(baseUrl + id, {observe : 'response'})

  }
}
