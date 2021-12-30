
class UserStorage{
 
 loginUser(id, password)
   {
       return new Promise((resolve,reject)=>{
        if(
            (id==='gimzi' && password ==='dream')||
            (id==='coder' && password ==='academy')
            ){
              resolve(id);
            }else{
                reject(new Error('not found'));
            }

       });
          
           
            
   
        
    }

    getRoles(user){
        return new Promise((resolve,reject)=>{
            setTimeout(() => {
                if(user ==='gimzi'){
                    resolve({ name : 'gimzi', role : 'admin' });
                }else{
                    reject(new Error('no access'));
                }
  
            },1000);
        })
        
    }
}


const userStorage = new UserStorage();
const id = prompt('enter your id');
const password = prompt('eneter your password');


async function helloUser(){

    const userStore= await userStorage.loginUser(id,password);
    const userRole = await userStorage.getRoles(id);
   return userRole;

}

helloUser().then(user => alert(user.name+'님 환영합니다'+user.role));


// userStorage.loginUser(
//     id,
//     password,
//     user=>{
//       userStorage.getRoles(user,
//         userWithRole =>{
//             alert('Hello ${userWithRole.name}+, you have a ${userWithRole.role} role')
//         },
//         error=>{
//             console.log(error);
//         })
// }, 
// error=>{
//     console.log(error);
// });