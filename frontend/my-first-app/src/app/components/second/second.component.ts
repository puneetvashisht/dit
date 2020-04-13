import { Component, OnInit, Input } from '@angular/core';
import { CommonService } from 'src/app/services/common.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {


  @Input('data') data: Array<string> = []
  private alphabetsListener: Subscription;
  
  constructor(private commonService: CommonService) { }



  ngOnInit(): void {
    this.alphabetsListener = this.commonService.getAlphabetsListener()
    .subscribe(res=> {
      console.log(res)
      this.data = res;
    })
    // this.commonService.loadData
    
  }

}
