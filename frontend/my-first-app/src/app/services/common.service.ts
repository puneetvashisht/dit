import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  private alphabetsListener = new Subject<Array<string>>();
  constructor(private http: HttpClient) { }


  loadData(){
     this.http.get('assets/dummy.json')
     .subscribe((res: Array<string>) => {
      this.alphabetsListener.next(res)
     })
  }

  getAlphabetsListener() {
    return this.alphabetsListener.asObservable();
  }
  // loadData(){
    
  //   this.http.get('assets/dummy.json')
  //   .subscribe((res:Array<string>)=>{
  //     this.alphabetsListener.next(res)
  //   })
  // }


}
