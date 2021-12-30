

//호이스팅 var, function declaration 이 젤 위로

console.log('1');
setTimeout(function(){
    console.log('2');
},1000);
console.log('3');
//setTimeout 브라우저 API

function printImmediately(print){
 print();
}

printImmediately(()=>console.log('hello'));

function printWithDelay(print,timeout){
    setTimeout(print,timeout);

}

printWithDelay(()=>console.log('async callback'),2000);


//Callback Hell excample

class UserStorage{
    loginUser(id, password, onSuccess, onError){
        setTimeout(()=>{
             if(
                 (id==='gimzi' && password ==='dream')||
                 (id==='coder' && password ==='academy')
                 ){
                     onSuccess(id);
                 }else{
                     onError(new Error('not found'))
                 }

        },2000);
    }

    getRoles(user, onSuccess, onError){
          setTimeout(() => {
              if(user ==='gimzi'){
                  onSuccess({name:'gimzi', role:'admin'});
              }else{
                  onError(new Error('no access'));
              }

          },1000);
    }
}


const userStorage = new UserStorage();
const id = prompt('enter your id');
const password = prompt('eneter your password');

userStorage.loginUser(
    id,
    password,
    user=>{
      userStorage.getRoles(user,
        userWithRole =>{
            alert('Hello ${userWithRole.name}+, you have a ${userWithRole.role} role')
        },
        error=>{
            console.log(error);
        })
}, 
error=>{
    console.log(error);
});