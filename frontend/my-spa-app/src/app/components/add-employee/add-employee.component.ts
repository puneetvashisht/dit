import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {


  showMessage : boolean = false;
  constructor(private employeeService : EmployeeService) { }

  ngOnInit(): void {
  }

  addEmployee(name: string, salary: number){
    console.log(name, salary);
    this.employeeService.addEmployee(name, salary)
    .subscribe(res=>{
      console.log(res)
      if(res.status == 201){
        this.showMessage = true;
      }
    });
  }

}
