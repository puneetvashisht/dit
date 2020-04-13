import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { CommonService } from 'src/app/services/common.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
  private alphabetsListener: Subscription;
  @Input('data') data: Array<string> = []
  // @Output('loaded') loaded: EventEmitter<Array<string>>= new EventEmitter();

  constructor(private commonService: CommonService) { }

  ngOnInit(): void {
    this.alphabetsListener = this.commonService.getAlphabetsListener()
    .subscribe(res=> {
      console.log(res)
      this.data = res;
    })
    // this.commonService.loadData
    
  }

  // ngOnInit(): void {
    // this.commonService.loadData()
    // .subscribe((res:any)=>{
    //   console.log('In first component ', res);
    //   this.data = res;
    // })
   
  // }

  loadData(){
    this.commonService.loadData()
    // this.commonService.loadData()
    // .then((res:any)=>{
    //   console.log('In first component ', res);
    //   this.data = res;
    // })
    // .subscribe((res: Array<string>)=> {
    //   console.log('In app component' ,res);
    //   this.data = res;
    //   // this.loaded.emit(this.data);
    // })

    
  }

}
