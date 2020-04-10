import { Component, OnInit, Input } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CourseService } from 'src/app/services/course.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  @Input('caption') title: string = ""
  @Input('summary') summary: string = ""
  @Input('id') id: number = null;

  now : Date = new Date();
  constructor(public courseService: CourseService) { }

  ngOnInit(): void {
  }


  deleteCourse(id: number){
    console.log('Delete course from here', id)
    // this.http.delete('http://localhost:8000/api/employee/' + id).toPromise()
    this.courseService.deleteCourse(id)
    .then(res=>console.log(res))
  }

}
