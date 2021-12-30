

//Promis 비동기 작동에 좋음 1상태, 프로듀싱,컨슈머
//state : pending -> fulfiled or rejected
//Producer vs Consumer


//1.Producer

const promise = new Promise(function(resolve,reject)
{
    //doing some heavy work(network, read files)
    console.log('doing something...');
    setTimeout(()=>{
        resolve('ellie')
        //reject(new Error('ohno'))
    },2000);
});


promise.then((value)=>{
    console.log(value);
})
.catch(error=>{
    console.log(error);
})
.finally(()=>console.log('finally'));


//3. Promise chaining

const fetchNumber = new Promise((resolve,reject)=>{
setTimeout(() => resolve(1),1000);

});


fetchNumber
.then(num => num*2)
.then(num => num*3)
.then(num=>{
    return new Promise((resolve,reject)=>{
    setTimeout(()=>resolve(num-1),1000);
});
})
.then(num=> console.log(num));
