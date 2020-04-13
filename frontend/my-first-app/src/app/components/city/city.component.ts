import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';


@Component({
  selector: 'app-city',
  templateUrl: './city.component.html',
  styleUrls: ['./city.component.css']
})
export class CityComponent implements OnInit {

  constructor() { }

  @Input('country') country: string = ""
  @Output('cityChanged') cityChanged: EventEmitter<string> = new EventEmitter();
  ngOnInit(): void {
  }

  handleBlur(city: string){
    console.log('In city component ', city)
    this.cityChanged.emit(city)
  }

}
