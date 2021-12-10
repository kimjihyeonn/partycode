var is_object = function(obj){
    return typeof obj == 'object' && !!obj;
}


var keys = function(obj){
    return is_object(obj) ? Object.keys(obj) : [];
}




var each = function(list,iter){

  
    for(var i = 0; i<list.length; i++){
        iter(list[i]);
    }


    return list;
}

var filter = function(list,predi){
    var new_list = [];

    each(list,function(val){
        if(predi(val)){
            new_list.push(val);
        }
    });
      return new_list;
}

var map = function(list,mapper){
    var new_list = [];
    each(list,function(val){
        new_list.push(mapper(val))
    });
    return new_list;

}


var curryr = function(fn){
    return function(a,b){
        return arguments.length==2 ? fn(a,b) : function(b){
            return fn(b,a);
        }
    }
}


var curry = function(fn){
    return function(a,b){
        return arguments.length==2 ? fn(a,b) : function(b){
            return fn(a,b)
        }
    }
}

var get = curryr(function(obj, key){
    return obj==null ? undefined : obj[key];
});


var slice = Array.prototype.slice;
var rest = function(list,num){
    return slice.call(list,num || 1);
}


var reduce = function(list,iter,memo){
    if(arguments.length==2){
        memo = list[0];
        list = rest(list);
    }
    each(list,function(val){
        memo = iter(memo,val);
    });
    return memo;
}

var pipe = function(){

    var fns = arguments;
    return function(arg){
        return reduce(fns,function(arg,fn){
            return fn(arg);
        },arg)
    }
}

var go = function(arg){
    var fns = rest(arguments);
    return pipe.apply(null,fns)(arg);
}

var map=curryr(map),
filter=curryr(filter);

