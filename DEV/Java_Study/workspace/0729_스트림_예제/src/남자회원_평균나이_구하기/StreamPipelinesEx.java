package 남자회원_평균나이_구하기;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelinesEx {

	public static void main(String[] args) {
		//Member 객체생성
		List<Member> list = Arrays.asList(new Member("손흥민",Member.MALE,30),
				                          new Member("김연경",Member.FEMALE,28),
				                          new Member("이강인",Member.MALE,26),
				                          new Member("이재영",Member.FEMALE,29),
				                          new Member("오수철",Member.MALE,32)
				);
      double sum = 0.0;
      int count= 0;
      //[해결문제] '남자' 회원의 나이의 합계를 구하시오.
      //[힌트] for문, 원하는 객체를 가져오는 메소드가 list.get(i)
      
     /* for(int i=0;i<5;i++) {
    	  if (list.get(i).getGender()==0) {
    	 count= list.get(i).getAge();
    	  sum +=count;}
      } 
     
      
      System.out.println(sum);
      
	}*/
      //확장된 for문 => 자바5버전에서 추가된 내용
      //[공식] for(클래스명 변수:참조변수)
     
      /*
      for(Member mem:list) {
    	  if(mem.getGender()==Member.MALE) {
    		  sum=sum+mem.getAge();
    		  count++;
    	  }
      

	}
   double ageAvg=sum/count;*/
      
    
   /*
    * 
    * 람다식과 스트림을 적용하여 해결하자!
    * 
    * 
    * 
    * 파이프라인을자바코드로 표현하기
    */
      Stream<Member> maleFemaleStream = list.stream();
      Stream<Member> maleStream 
        = maleFemaleStream.filter(m->m.getGender()==Member.MALE);
      IntStream ageStream = maleStream.mapToInt(Member::getAge);
      OptionalDouble optionalDouble = ageStream.average();
      double ageAvg=optionalDouble.getAsDouble();
      
      /*
       * 위 소스에서 로컬변수를 생략하고 연결한면 다음과 같은 파이프라인 코드만 남는다.
      double ageAvg= list.stream()//컬렉션으로부터 스트림 얻기
    		         .filter(m->m.getGender()==Member.MALE)
    		         .mapToInt(Member::getAge)
    		         .average()  //최종처리 스트림
                     .getAsDouble();  ///결과값 가져오기*/
      
      
   System.out.format("남자 회원의 평균나이:"+"%.2f",ageAvg);
   
   //소수점 이하 3자리까지만 출력하고자 할때
	}
}
