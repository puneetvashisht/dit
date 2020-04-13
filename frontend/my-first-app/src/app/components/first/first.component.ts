import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { CommonService } from 'src/app/services/common.service';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  @Input('data') data: Array<string> = []
  @Output('loaded') loaded: EventEmitter<Array<string>>= new EventEmitter();

  constructor(private commonService: CommonService) { }

  ngOnInit(): void {
  }

  loadData(){
    this.commonService.loadData()
    .then((res: Array<string>)=> {
      console.log('In app component' ,res);
      this.data = res;
      this.loaded.emit(this.data);
    })
  }

}
