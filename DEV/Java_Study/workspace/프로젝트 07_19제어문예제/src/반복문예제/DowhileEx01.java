package 반복문예제;

public class DowhileEx01 {

	public static void main(String[] args) {
          
		
       int i = 1;
       int sum = 0;
       do {
    	   sum += i;
    	   i++;
       }while(i <=100);
       System.out.println("1부터 100까지의 합은"+sum+"이다");

	}

}
