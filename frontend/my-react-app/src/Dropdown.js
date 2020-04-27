import React, { Component } from 'react';

class Dropdown extends Component {
    // state = {  }
    // This is not allowed
    // courses = ['Angular', 'React', 'Ember'];

    constructor(props){
        super(props);
        this.state = {courses : ['Angular', 'React', 'Ember']}
    }

    handleClick(){
        console.log('click event on dropdown button')
    }

    render() {

        let courseList = this.state.courses.map((course, i)=> {
            console.log(course, i)
            return <a className="dropdown-item" href="#">{course}</a>
        })
        console.log(courseList)


        return (
            <div className="dropdown">
                <button onClick={this.handleClick} className="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {this.props.caption}
                </button>
                <div className="dropdown-menushow" aria-labelledby="dropdownMenuButton">
                {courseList}
                </div>
            
            </div>
        );
    }
}

export default Dropdown;

