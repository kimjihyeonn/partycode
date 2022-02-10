package method.basic;

public class MethodEx01 {


    public static void main(String[] args) {
	 
    	//1. 1~10까지 합
    	
    
    	
    
        
    	System.out.println("1~10까지의합:" +calSum());
    	int result = calSum();
    	
    	System.out.println(result);
    	
    	String result2=randomStr();
    	System.out.println(result2);
    	
    }
    
    
    static String randomStr() {
    	String str = "";
    	for(char c = 'A'; c<='Z' ; c++) {
    		str += c;
    		
    	}
    	
    	return str;
    }
    static int calSum() {
    	int sum = 0;
    	for(int i = 1; i<=10; i++) {
    		sum += i;
    	}
    	
    	
    	return sum;
    	
    	
    }

}
