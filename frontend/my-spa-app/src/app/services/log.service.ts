import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LogService {

  public logs : Array<string> = ['my first log']

  add(message: string){
    this.logs.push(message)
  }

  constructor() { }
}
