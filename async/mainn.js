
// class Counter{
//        constructor(){
//            this.counter = 0;
//        }
//        increase(){
//            this.counter ++;
//            if(this.counter%5 ===0){
//                console.log('yo!')
//            }
//        }


// }

// const counter = new Counter();



// for(let i= 0; i<10; i++){
  
//     console.log(counter.counter);
//     counter.increase();
// }


// let a= [1,[1,2,3]];

// let b= 
// Object.assign(a[0],a[1]);

// b[0]= 100;
// b[1][1]=100;

// console.log(a);
// console.log(b);




function getData() {
    var tableData;
    setTimeout( function (response) {
        tableData = response;
    },2000);
    return tableData;
}
 
console.log(getData()); 

const s = new WeakSet();