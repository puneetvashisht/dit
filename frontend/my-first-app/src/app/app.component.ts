import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CourseService } from './services/course.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{


  constructor(public courseService: CourseService ){
 
  }

  ngOnInit(){
    console.log('Initialization code will be...')
    // this.http.get('http://localhost:8000/api/employee').toPromise()
    this.courseService.fetchAllCourses()
    .then((res: any) => {
      console.log(res);
      this.courses = res;
    })
  }


  title :string = 'Welcome to Angular App';
  courses: Array<any> = []
}
