var is_object = function(obj){
    return typeof obj == 'object' && !!obj;
}


var keys = function(obj){
    return is_object(obj) ? Object.keys(obj) : [];
}




var each = function(list,iter){

    var keyss = keys(list);
    for(var i = 0,len=keyss.length; i<len; i++){
        iter(list[keyss[i]],keyss[i]);
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
    each(list,function(val,key){
        new_list.push(mapper(val,key))
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

var identity= function(val){
    return val;
}

var values = map(identity);

var pluck = function(data,key){
    return map(data,get(key));


}

var reject = function(data,predi){
    return filter(data,negate(predi)
    );

}

var negate =function(func){
    return function(val){
        return !func(val);
    }
}

var compact = filter(identity);



var find = curryr(function(list,predi){

    var keyss = keys(list);
    for(var i = 0,len=keyss.length; i<len; i++){
        var val = list[keyss[i]];
       if (predi(val)) {return val;};
    }
 
});

var find_index = curryr(function(list,predi){

    var keyss = keys(list);
    for(var i = 0,len=keyss.length; i<len; i++){
      
       if (predi(list[keyss[i]])) {return i;};
    }
 
});

var some = function(list, predi){
    return find_index(list,predi || identity) != -1;
}

var every = function(list,predi){
    return find_index(list, negate(predi||identity)) == -1;
}

var min = function(data){
    return reduce(data,function(a,b){
        return a < b? a: b;
    })
}


var max = function(data){
    return reduce(data,function(a,b){
        return a > b? a: b;
    })
}

var min_by = curryr(function(data,iter){
    return reduce(data,function(a,b){
        return iter(a) < iter(b) ? a: b;
    })
});

var max_by = curryr(function(data,iter){
    return reduce(data,function(a,b){
        return iter(a) > iter(b) ? a: b;
    })
});

var push = function(obj,key,val){
    (obj[key] = obj[key] || []).push(val);
    return obj;
}

var group_by = curryr(function(data,iter){
 return reduce(data, function(grouped,val){
     return push(grouped,iter(val),val);}
,{})

});

var head = function(list){
    return list[0];
}

var count_by = curryr(function(data,iter){
    return reduce(data,function(count,val){
        var key = iter(val);
        count[key] ? count[key]++ : count[key]= 1;
       return count;
     
    },{})


})



console.log('hi');
setTimeout(function(){
    console.log('there');
},500);
console.log('JSConFu');


