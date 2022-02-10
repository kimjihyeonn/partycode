package Set계열;

import java.util.HashSet;
import java.util.Set;


/*
 * HashSet은 객체를 추가(저장)하기 전에
 * 먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어온다.
 * 그리고 이미 저장되어있는 객체들의 해시코드와 비교한다.
 * 만약 동일한 해시코드가 있다면 equals()메소드로 두객체를 비교해서 true가 나오면
 * 동일한 객체로 판단하고 중복저장을 하지 않는다.
 */
public class HashSetClassEx {

	public static void main(String[] args) {
	  Set<Member> member_set = new HashSet<Member>();
	  
	  System.out.println(member_set);
	  
	  /**
	   * HashSet이라는 자료구조는 중복을 허용하지 않는 자료를 관리할 때 유용하게 사용된다.
	   */
	  //금융권 사례
	  Member member1 = new Member("손흥민",29,"11111-1111111");
	  Member member2 = new Member("구자철",29,"11111-1111111");
	  Member member3 = new Member("손흥민",29,"11111-1111111");
	 
	  member_set.add(member1);
	  member_set.add(member2);
	  member_set.add(member3);
	  
	  System.out.println(member_set);
	}


	}


