import React, { Component } from 'react';

class Employee extends Component {
    
    constructor(props){
        super(props)
        this.state= {employees: null}
    }

    componentWillMount() {
        fetch('http://localhost:8000/api/employee')
        .then(res=> res.json())
        .then(result=>{
            console.log(result)
            this.setState({employees: result})
        })
    }

    handleNameChange(event){
        // console.log('change event fired')
        // console.log(event.target.value);
        this.setState({name: event.target.value})
    }
    handleSalaryChange(event){
        // console.log('change event fired')
        // console.log(event.target.value);
        this.setState({salary: event.target.value})
    }

    handleSubmit(event) {
        console.log('A name was submitted: ' + this.state.name , this.state.salary);
        fetch('http://localhost:8000/api/employee', {
            method: 'POST', // *GET, POST, PUT, DELETE, etc. 
            headers: {
              'Content-Type': 'application/json'
            },
            body: JSON.stringify({name:this.state.name, salary: this.state.salary }) // body data type must match "Content-Type" header
          })
          .then(res=>{
              console.log(res);
              this.setState({message: 'Employee added successfully!!'})
          })

        event.preventDefault();
      }

    render() {
        if(!this.state.employees)
            return null;

        var employeeList = this.state.employees.map((employee, i)=> {
            return (
               <li>{employee.name} - {employee.salary}</li>
            )
        })    
        return (
            <div>
                <form>
                    <label>
                    Name:
                    <input type="text" onChange={this.handleNameChange.bind(this)} value={this.state.name}/>

                    </label>
            
                    <label>
                    Salary:
                    <input type="number" onChange={this.handleSalaryChange.bind(this)} value={this.state.salary} />
                    </label>
                    <input type="button" onClick={this.handleSubmit.bind(this)} value="Add Employee" />
                </form>

                <ul>
                    {employeeList} 
                </ul>
            </div>
        );
    }
}

export default Employee;