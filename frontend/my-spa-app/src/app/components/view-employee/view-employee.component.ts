import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee.service';
import { Employee } from 'src/app/models/employee';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent implements OnInit {
  showMessage : boolean = false;
  employees: Array<Employee> = []

  constructor(private employeeService : EmployeeService, private router: Router) { }

  ngOnInit(): void {
    this.employeeService.fetchAllEmployees()
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

}
