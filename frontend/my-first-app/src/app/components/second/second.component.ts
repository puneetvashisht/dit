import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {


  @Input('data') data: Array<string> = []
  constructor() { }

  ngOnInit(): void {
  }

}
