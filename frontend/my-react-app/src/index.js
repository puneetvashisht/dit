import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
// import App from './App';
import Badge from './Badge'
import Clock from './Clock'
import Dropdown from './Dropdown'
import Lifecycle from './Lifecycle'
import Employee from './Employee'
import * as serviceWorker from './serviceWorker';



// const element =(<h2>Some title</h2>);
// ReactDOM.render(element, document.getElementById('message'))


// setInterval(()=>{
//   var today = new Date();
//   var hours = today.getHours();
//   var minutes = today.getMinutes();
//   var seconds = today.getSeconds();
//   ReactDOM.render(
//     <React.StrictMode>
//       <Badge></Badge>
//       <Clock title="My React Clock!!" hours={hours} minutes={minutes} seconds={seconds}></Clock>
//     </React.StrictMode>,
//     document.getElementById('root')
//   );
// }, 1000)

ReactDOM.render(
  <React.StrictMode>
    {/* <Badge></Badge> */}
    <Dropdown caption="Select Courses"/>
     <Lifecycle></Lifecycle>
     <hr/>
     <Employee></Employee>
  </React.StrictMode>,
  document.getElementById('root')
);



// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
