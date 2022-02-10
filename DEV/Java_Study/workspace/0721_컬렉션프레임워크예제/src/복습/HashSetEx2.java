package 복습;
/*
 *HashSet은 객체를 추가(저장)하기 전에
 *먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어온다.
 *그리고 이미 저장되어있는 객체들의 해시코드와 비교한다.
 *만약 동일한 해시코드가 있다면 equals()메소드로 두객체를 비교해서 true가 나오면 동일한 객체로
 *판단하고 중복저장을 하지 않는다.
 */

import java.util.HashSet;
import java.util.Set;


public class HashSetEx2 {

	public static void main(String[] args) {
		Set<prac1> member_set=new HashSet<prac1>();
		
		prac1 member1= new prac1("김지현",22,"11111111");

				prac1 member2= new prac1("김지현",22,"11111111");
				
				
				member_set.add(member1);
				member_set.add(member2);
				
				System.out.println(member_set.size());
		
		

	}

}
