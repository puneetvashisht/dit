import React, { Component } from 'react';

class Lifecycle extends Component {

    constructor(props){
        super(props);
        this.state = {counter: 0}
    }


    incrementCount(){
        let newCounter = ++this.state.counter
        console.log(newCounter)
        this.setState({counter: newCounter})
        // console.log(this.state.counter)
    }
  
    render() {
        return (
            <div>
                <p>{this.state.counter}</p>
                <button onClick={this.incrementCount.bind(this)}>Increment Count</button>
            </div>
        );
    }
}

export default Lifecycle;