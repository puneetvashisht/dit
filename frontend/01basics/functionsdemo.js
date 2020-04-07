function foo() {
    console.log('inside foo function');
}

var bar = function () {
    console.log('inside bar function');
}

// foo();
// bar();


function printMe(fn) {
    console.log('Inside printMe function')
    fn();
}

// printMe(foo);
// printMe(bar);
// printMe(function(){console.log('inside test funtion')})
// printMe(()=>console.log('inside yet another function'))

function outer() {
    var x = 2;
    console.log('outer function..')
    var inner = function () {
        console.log("inner function..")
        console.log(x+2);
        var x = 0;
    }
    return inner;
}
// var x = outer();
// x();
// outer()();

// 1. Creation of lexical scopes
// outerFn: [x: undefined, inner: undefined]
// innerFn: [x: undefined]

// 2. Execution
// outerFn: [x: 2, inner: fn]
// innerFn: [x: undefined]

var obj = {}
console.log(typeof(obj))

var employee = {id:12, name:'Ravi', salary: 34343.34, getName: function(){return this.name}}
console.log(employee);
console.log(employee.getName());
employee.city = "Delhi";

var address1 = {houseNumber: 134, locality: 'GK', city: 'Delhi'}
var address2 = {houseNumber: 133, locality: 'GK', city: 'Delhi'}

var addresses = []
addresses.push(address1)
addresses.push(address2)
addresses.push(employee);
console.log(addresses)
// console.log(employee['name']);