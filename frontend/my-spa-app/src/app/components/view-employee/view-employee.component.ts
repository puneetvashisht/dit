import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee.service';
import { Employee } from 'src/app/models/employee';
import { Router } from '@angular/router';
import { LogService } from 'src/app/services/log.service';

import {map, filter} from 'rxjs/operators'

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent implements OnInit {
  showMessage : boolean = false;
  employees: Array<Employee> = []

  constructor(private employeeService : EmployeeService, private router: Router,public logService: LogService) { }

  ngOnInit(): void {
    this.employeeService.fetchAllEmployees()
    // .pipe(filter((res:Array<Employee>)=> ), map((res:Array<Employee>) => 'Count: ' + res))
    .pipe(map((obj:Array<Employee>) =>{console.log('In map', obj);
      return obj.filter( emp => emp.name !== '' )
      // console.log(filteredList)
      // return filteredList
      })
    )
    .subscribe((res:Array<Employee>)=> {
      console.log(res);
      this.employees = res;
    })
  }

  deleteEmployee(id: number){
    this.employeeService.deleteEmployee(id)
    .subscribe((res:any)=> {
      console.log(res);
     if(res.status == 200){
       this.showMessage = true;
       this.employees = this.employees.filter((employee)=> employee.id!=id)
     }
    })
  }

  editEmployee(employee: Employee){
    console.log('edit employee' , employee);
    this.router.navigate(['add', employee])
  }

  log(message: string){
    this.logService.add(message)
    this.showMessage = !this.showMessage
    this.employeeService.sharedData = {
      "name": "java",
    "question": [
              {
              "name": "q1",
              "option": [
                  {
                      "name": "Exception",
                      "is_answer": "false"
                  },
                  {
                      "name": "Code-behind",
                      "is_answer": "true"
                  },
                  {
                      "name": "Code-front",
                      "is_answer": "false"
                  },
                  {
                      "name": "None of the above",
                      "is_answer": "false"
                  }
                  ]
              },
              {
              "name": "q2",
              "option": [
                  {
                      "name": "Exception",
                      "is_answer": "false"
                  },
                  {
                      "name": "Code-behind",
                      "is_answer": "true"
                  },
                  {
                      "name": "Code-front",
                      "is_answer": "false"
                  },
                  {
                      "name": "None of the above",
                      "is_answer": "false"
                  }
                  ]
              }
              ]
  }

  }

}
