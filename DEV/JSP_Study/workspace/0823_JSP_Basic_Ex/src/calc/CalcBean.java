package calc;

public class CalcBean { //����(Beans)Ŭ���� �Ǵ� POJO Ŭ����
	//�������(=������Ƽ, �߰������) ����
	private int num1,num2;
	
	private String operator= "";
	private int result;
	
	
	//��Ģ������ ����ϴ� �޼ҵ� ����

	
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
	//������� �ϳ��� ���ͼ��� �޼ҵ�
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
