// console.log('callbacks')
// Not available in JS library
function sleep(millis)
{
    var date = new Date();
    var curDate = null;
    do { curDate = new Date(); }
    while(curDate-date < millis);
}

function synch(){
    console.log('do some sync functinality');
    sleep(5000)
    return "success"
}

// console.log('starting...')
// var result = synch();
// console.log(result)
// console.log('finished...')

// Puneet
function asynch(callback){
    console.log(callback)
    setTimeout(()=>{
        console.log('do some sync functinality');
        sleep(5000)
        callback("success")
        // return "success"
    }, 0)   
}


// console.log('starting...')

function callback(result){
    console.log(result)
}

// var result = asynch((result)=> console.log(result));
// DIT team
// var result = asynch(callback);
// console.log(result)
// console.log('finished...')


function asynch_promises(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log('do some sync functinality');
            sleep(5000)
            // resolve("success")
            reject("id was not supplied")
        }, 0)
    })     
}
console.log('starting...')
asynch_promises()
.then((result)=> console.log(result))
.catch((error)=> console.log(error))
console.log('finished...')
