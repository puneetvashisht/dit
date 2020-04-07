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
outer()();

// 1. Creation of lexical scopes
// outerFn: [x: undefined, inner: undefined]
// innerFn: [x: undefined]

// 2. Execution
// outerFn: [x: 2, inner: fn]
// innerFn: [x: undefined]

var obj = {}
console.log(typeof(obj))