package api.generic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		ABC<String> abc = new ABC<>();
		
		abc.setT("홍길동");//문자열을 저장하는 용도
        String s =abc.getT();
        
        
        ABC<Person> p = new ABC<>();
        p.setT(new Person());
        Person park =p.getT();
        //제네릭문법에는 기본형을 사용할 수 없습니다.
//        ABC<int> i = new ABC<>();
        ABC<Integer> i = new ABC<>();
        
        Class<?> a = i.getClass();
        
        System.out.println(a);
        
        /*
         *  <?>
         *  <? extends String>
         *  <? super String>
         *  
         */
   Person pp = new Person();
   Class<? extends Person> as =pp.getClass();
   
   System.out.println(as);
   
   
	}

}
