import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-country',
  templateUrl: './country.component.html',
  styleUrls: ['./country.component.css']
})
export class CountryComponent implements OnInit {

  city: string = ''
  constructor() { }

  ngOnInit(): void {
  }

  handleCityChanged(city: string){
    console.log('In parent component ', city)
    this.city = city;
  }

}
