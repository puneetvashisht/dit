import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-badge',
  templateUrl: './badge.component.html',
  styleUrls: ['./badge.component.css']
})
export class BadgeComponent implements OnInit {

  constructor() { }

  @Input('caption') caption: string = 'Default'
  @Input('count') count: number = 0;

  handleClick(){
    console.log('click event captured');
    this.count++;
  }

  ngOnInit(): void {
  }

}
