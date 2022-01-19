var curry = function(fn){
    return function(a,b)
    { 
        return arguments.length ==2 ? fn(a,b):function(b){
             return fn(a,b);};
       
    }
}


var curryr= function(fn){
    return function(a,b){
        return arguments.length==2? fn(a,b):function(b){
            return fn(b,a);
        };
    }
}


var get =curryr( function(obj, key) {
    
    return obj == null ? undefined : obj[key];
});


var is_object = function(obj){
    return typeof obj == 'object' && !!obj;
}

var keys = function(obj){
    return is_object(obj) ? Object.keys(obj): [] ;
}

var length = get('length');
var each =function(list,iter){
    var keyss = keys(list);
    
     
    for( var i=0,len=keyss.length; i<len; i++){
             iter(list[keyss[i]]);
           
          }
          return list;
      
          
}

// var each = function(list,iter){
//     for(var i=0; i<list.length;i++){
//         iter(list[i]);
//     }
// }

var filter = function(list,predi){
    var ret_val =[];

each(list,function(val){
  
        if(predi(val)) ret_val.push(val);
        
    })
   
    return ret_val;
}


var map = function(list,mapper){
    var ret_val =[];
    each(list,function(val){ 
        
        ret_val.push(mapper(val));
       
    })
      
        return ret_val;

 }


 var slice = Array.prototype.slice;
var rest = function(list,num){
    return slice.call(list, num || 1);

}
var reduce=function(list,iter,memo){
    if(arguments.length==2){
        memo = list[0];
        list = rest(list);
    }
    each(list,function(val){
  
       
        memo=iter(memo,val);
        
    });
  return   memo;
};


var pipe= function(){
    var fns = arguments;  //함수들 f,f,f o , [f,f,f] x
    
    return function(arg){ //arg=초기값
      return reduce(fns, function(arg, fn){
          
             return(fn(arg)) },arg);
            
 
    }
 }
 var go = function(arg){
     var fns = rest(arguments);
    return pipe.apply(null, fns)(arg);
 }

 var map = curryr(map);
var filter = curryr(filter);



const iterable = {
    [Symbol.iterator]() {
        let i = 3;
        return {
            next() {
                return i ==0 ? {done:true} : {value : i-- , done:false};
            },
            [Symbol.iterator](){
                return this;
            } }}};