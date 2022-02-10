package 로또번호발생기구현;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSet_Lotto {

	public static void main(String[] args) {
		Set set =new HashSet();
		/*
		 * 로또번호 범위: 1~45까지
		 * 6자리가 필요하다
		 */
		for(int i=0; set.size()<6;i++) {
			Random rnd = new Random();
			int number = rnd.nextInt(45)+1;//1~45까지의 범위의 난수 발생시킨다
			set.add(new Integer(number)); //정수를 객체화시킴!!
			
		}
           
		
		
           
           List list=new ArrayList(set); 
           Collections.sort(list);
           
           System.out.println("<<로또번호만들기>>");
           System.out.println(list.get(1));
	}

	

}
