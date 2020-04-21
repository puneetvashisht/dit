import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import {filter, map} from 'rxjs/operators'

@Component({
  selector: 'app-observe',
  templateUrl: './observe.component.html',
  styleUrls: ['./observe.component.css']
})
export class ObserveComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {

    // Custom observable 
    let customObservable = Observable.create((observer)=>{
      let count = 0;
      setInterval(()=> {
        let newcount = count++
        // if(newcount == 5){
        //   observer.error(new Error('Value 5 is not permitted'))
        // }
        if(newcount > 9){
          observer.complete(newcount)
        }
        observer.next(newcount);


      }, 1000)

     
    })

    // subscription to custom observable
    customObservable.pipe(filter((count)=> count>0), map((res) => 'Count: ' + res))
    
    .subscribe((result)=> console.log(result) , (error)=>console.log(error))
   

    // let customPromise = new Promise((resolve, reject)=> {
    //   resolve('success -- promise')
    // } )
    // customPromise.then(res => console.log(res))


  }

}
