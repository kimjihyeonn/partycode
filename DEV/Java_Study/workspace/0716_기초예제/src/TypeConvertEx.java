
public class TypeConvertEx {

	public static void main(String[] args) {
		
		byte byteValue =20;   //1바이트
		int intValue = byteValue; //4바이트
		System.out.println(intValue);
		
		
		intValue = 500;  //4바이트
		long longValue = intValue; // 8바이트
		
		System.out.println(longValue);
		
		/**
		 *강제 타입 변환 예 
		 * 
		 */
		int intValue2 = 44035;
		char charValue = (char) intValue2;
		System.out.println(charValue);
		
		
		long longValue2 = 20000000;
		int intVal = (int) longValue2;
		
		System.out.println(intVal);
		
		
  
	}

}
