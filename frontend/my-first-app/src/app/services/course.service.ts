import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const baseUrl = 'http://localhost:8000/api/employee/'

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  constructor(public http:HttpClient) { }

  fetchAllCourses(){
    console.log('fetch in service')
    return this.http.get(baseUrl).toPromise()
  }

  deleteCourse(id: number){
    return this.http.delete(baseUrl + id).toPromise()
  }

}
