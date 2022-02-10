package api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		int a = 100;
		double b= 3.14;
		char c = 'A';
		
		//boxing - �⺻��->��ü������ ����
		
		Integer i1 = new Integer(a);
		Double d1 = new Double(b);
		Character c1 = new Character(c);
		
		
		//unboxing - ��ü�� -> �⺻������ ����
		int var1 = i1.intValue();
		double var2 = d1.doubleValue();
		char var3 = c1.charValue();
		
		//autoboxing - ����Ŭ������ �⺻Ÿ�԰��� �ڵ� ����ȯ�� ����.
		int k = i1;
		
		Integer i2 = k;
		
		
		//wrapper Ŭ������ ��ǥ���� ���
		int a1=Integer.parseInt("1");
		double a2 = Double.parseDouble("31.4");
		
		long a3 = Long.parseLong("4444233");

	}

}
