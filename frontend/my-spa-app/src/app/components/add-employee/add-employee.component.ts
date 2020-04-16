import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { LogService } from 'src/app/services/log.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
s
  editMode : boolean = false;
  myForm: FormGroup;
  showMessage : boolean = false;
  constructor(private employeeService : EmployeeService, private route: ActivatedRoute, public logService: LogService) {
    this.myForm = new FormGroup({
        'id': new FormControl('' ,[Validators.required]),
        'name': new FormControl('' ,[Validators.required]),
        'salary': new FormControl('', Validators.min(10000))
      // 'email' : new FormControl('', [Validators.required, Validators.pattern("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")])
    })

   }


  

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      console.log('***', params.get('id'));
      if(params.get('id') != null){
         this.editMode = true;
      }
      this.myForm.controls['id'].setValue(params.get('id'));
      this.myForm.controls['name'].setValue(params.get('name'));
      this.myForm.controls['salary'].setValue(params.get('salary'));
    });
  }

  updateEmployee(){
    console.log(this.myForm)
    console.log(this.myForm.value);
    // console.log(this.myForm.controls['name'])
    // console.log(name, salary);
    this.employeeService.updateEmployee(this.myForm.value)
    .subscribe(res=>{
      console.log(res)
      if(res.status == 202){
        this.showMessage = true;
      }
    });
  }

  addEmployee(){
    console.log(this.myForm)
    console.log(this.myForm.value);
    // console.log(this.myForm.controls['name'])
    // console.log(name, salary);
    this.employeeService.addEmployee(this.myForm.value)
    .subscribe(res=>{
      console.log(res)
      if(res.status == 201){
        this.showMessage = true;
      }
    });
  }

  log(message: string){
    this.logService.add(message)
  }

}
