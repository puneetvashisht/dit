import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const baseUrl = 'http://localhost:8000/api/employee/'

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  constructor(public http:HttpClient) { }

  fetchAllCourses(){
    
    // return new Promise((resolve, reject)=> {
    //   var str = localStorage.getItem('courses')
    //   if(str){
    //     var courses = JSON.parse(str)
    //   }
    //   else{
    //     courses = [];
    //   }
     
    //   resolve(courses);
    // })
    return this.http.get(baseUrl);
  }

  deleteCourse(id: number){
    return this.http.delete(baseUrl + id).toPromise()
  }

}
