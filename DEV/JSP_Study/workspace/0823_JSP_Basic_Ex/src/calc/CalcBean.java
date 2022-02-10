package calc;

public class CalcBean { //빈즈(Beans)클래스 또는 POJO 클래스
	//멤버변수(=프로퍼티, 중간저장소) 선언
	private int num1,num2;
	
	private String operator= "";
	private int result;
	
	
	//사칙연산을 담당하는 메소드 구현

	
	public void calculate() {
		 if(operator.equals("+")){
   		  result=num1+num2;
   	  }
   	  else if(operator.equals("-")){
   		  result=num1-num2;
   	  }
   	  else if(operator.equals("*")){
   		  result=num1*num2;
   	  }
   	  else if(operator.equals("/")){
   		  result=num1/num2;
   	  }
		
		
	}
	//멤버변수 하나당 게터셋터 메소드
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	
	

}
