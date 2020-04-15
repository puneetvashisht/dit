import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  myForm: FormGroup;
  showMessage : boolean = false;
  constructor(private employeeService : EmployeeService) {
    this.myForm = new FormGroup({
        'name': new FormControl('' ,Validators.required),
        'salary': new FormControl('', Validators.min(10000))
      // 'email' : new FormControl('', [Validators.required, Validators.pattern("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")])
    })

   }


  

  ngOnInit(): void {
  }

  addEmployee(){
    console.log(this.myForm)
    
    console.log(this.myForm.controls['name'])
    // console.log(name, salary);
    // this.employeeService.addEmployee(name, salary)
    // .subscribe(res=>{
    //   console.log(res)
    //   if(res.status == 201){
    //     this.showMessage = true;
    //   }
    // });
  }

}
