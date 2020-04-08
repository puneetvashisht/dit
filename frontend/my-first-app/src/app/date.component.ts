import { Component } from '@angular/core';

@Component({
  selector: 'my-date',
  template: `
    <h2>Today's date is : {{now}}</h2>
  `
})
export class DateComponent{
    now = new Date();
}