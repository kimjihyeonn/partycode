package 로또번호발생기구현;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
		
		
		/***
		 * 
		 * TreeSet 객체는 저장할 때 이미 정렬하기 때문에 따로 정렬할 필요가 없다.
		 * [이유] 이진 검색트리 알고리즘의 형태로 데이터를 저장한다. => 이런매커니즘에 의해서..
		 * @param args
		 */

public class TreeSet_Lotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i=0; set.size()<6;i++) {
			Random rnd = new Random();
			int number = rnd.nextInt(45)+1;
			set.add(new Integer(number));
		}
		System.out.println("<<<행운의 로또번호 만들기>>>");
		System.out.println(set);

	}

}
