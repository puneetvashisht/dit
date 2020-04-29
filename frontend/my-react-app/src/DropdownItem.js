import React, { Component } from 'react';

class DropdownItem extends Component {

    constructor(props){
        super(props)
    }

    handleItemClick(item){
        this.props.whenItemClick(item)
    }
    
    render() {
        return (
            <a className="dropdown-item"  onClick={this.handleItemClick.bind(this, this.props.text)} href="#">{this.props.text}</a>
        );
    }
}
 
export default DropdownItem;