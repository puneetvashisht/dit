function foo(){
    console.log('inside foo function');
}

var bar = function(){
    console.log('inside bar function');
}

// foo();
// bar();


function printMe(fn){
 console.log('Inside printMe function')
 fn();
}

printMe(foo);
printMe(bar);
printMe(function(){console.log('inside test funtion')})
printMe(()=>console.log('inside yet another function'))