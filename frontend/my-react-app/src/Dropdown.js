import React, { Component } from 'react';
import DropdownItem from './DropdownItem'

class Dropdown extends Component {
    // state = {  }
    // This is not allowed
    // courses = ['Angular', 'React', 'Ember'];

    constructor(props){
        super(props);
        this.state = {courses : ['Angular', 'React', 'Ember'], showFlag: false, caption: null}
    }

    handleClick(){
        console.log('click event on dropdown button')
        console.log(this.state)
        // this.state.showFlag = !this.state.showFlag
        this.setState({showFlag: !this.state.showFlag})
    }

    handleItemClick(item){
        console.log('Item is getting clicked..', item)
        // this.state.caption = item
        this.setState({caption: item, showFlag: false})
    }

    render() {

        let courseList = this.state.courses.map((course, i)=> {
            console.log(course, i)
            return <DropdownItem text={course} whenItemClick={this.handleItemClick.bind(this)}></DropdownItem>
            // return <a className="dropdown-item" onClick={this.handleItemClick.bind(this, course)} key={i} href="#">{course}</a>
        })
        console.log(courseList)


        return (
            <div className="dropdown">
                <button onClick={this.handleClick.bind(this)} className="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {this.state.caption || this.props.caption} 
                </button>
                <div className={this.state.showFlag?'dropdown-menushow': 'dropdown-menu'} aria-labelledby="dropdownMenuButton">
                {courseList}
                </div>
            
            </div>
        );
    }
}

export default Dropdown;

