import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title :string = 'Welcome to Angular App';
  courses: Array<any> = [
    {title: 'Angular', summary:'Framework from Angular'},
    {title: 'React', summary:'Library from facebook'},
    {title: 'Ember', summary:'Framework for UI'},
    {title: 'Js', summary:'Most popular programming language'}
  ]
}
