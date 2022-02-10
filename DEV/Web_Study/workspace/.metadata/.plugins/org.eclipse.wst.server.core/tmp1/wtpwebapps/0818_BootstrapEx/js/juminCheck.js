/**
 * 
 */

 function juminCheck(jumin1,jumin2){
     var juminNum= jumin1+jumin2;
     var jumin_pattern = new RegExp('^[0-9]{6}[1234][0-9]{6}');
     if(!jumin_pattern.test(juminNum)){
    	 alert('주민번호가 정규 표현식(유효성) 패턴에 적합하지 않습니다.');
     }else{
    	 alert('주민번호가 정규 표현식(유효성) 패턴에 적합 합니다.');
     
    	 var sum = 0;
    	 var temp= 0;
    	 var result= 0;
    	 var weight= new Array(2,3,4,5,6,7,8,9,2,3,4,5);
    	 for(i=0; i<12;i++){
    		 sum = sum+(juminNum.charAt(i))*weight[i];
    	 }
    	 temp= 11-(sum%11);
    	 result= temp%10;
    	 
    	 if(result!=juminNum.charAt(12)){
    		 alert('주민번호가 정확하지 않습니다. 다시확인하세요 !!')
    		 
    	 }else{
    		 alert('주민번호 정상입니다.')
    	 }
     }
     
 } 
 