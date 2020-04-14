import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent implements OnInit {

  employees: Array<any> = []

  constructor(private employeeService : EmployeeService) { }

  ngOnInit(): void {
    this.employeeService.fetchAllEmployees()
    .subscribe((res:any)=> {
      console.log(res);
      this.employees = res;
    })
  }

}
