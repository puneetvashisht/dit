
// Data types - primitives (string, number, boolean)
var i = '0.45'
typeof(i)

// function syntax
function xyz(){
    console.log('xyz');
}
xyz();

//overloaded function works for any data type
function add(x, y){
    return x + y;
}

console.log(add(3,4))

console.log(add("3", "4"))
