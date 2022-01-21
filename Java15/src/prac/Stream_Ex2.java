package prac;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Ex2 {
	
	public static void main(String[] args) {
	  //IntStream intStream  = new Random().ints();//무한스트림
	  IntStream intStream  = new Random().ints(5,10,20);//유한개주기
	//  intStream.limit(5).forEach(System.out::println);//5개만 잘라서 출력하기
	intStream.forEach(System.out::println);//5개만 잘라서 출력하기
	  
	IntStream.range(1, 5); //1<= a <5
	IntStream.rangeClosed(1, 5);// 1<= a <= 5
	
	//람다식을 소스로하는 스트림 생성하기
	
	//iterate() seed(초기값)사용
	
	//generate() seed(초기값)없음
	 Stream<Integer> intStream2 =  Stream.iterate(0,n->n+2);
	  
	 intStream2.limit(10).forEach(System.out::println);
	 
	Stream<Integer> intStream3 = Stream.generate(()->1);
	 intStream3.limit(10).forEach(System.out::print);
	 
	 //중간연산 n번
	 //최종연산1번
	 //Optional 래퍼클래스 작업결과
     //findAny 아무거나하나
	 //findFirst 첫번째 요소
	 //allMatch(),anyMatch(), noneMatch(), toArray()
	 //reduce(),collect()
	 
	 
	 //중간연산
	 //skip() 앞에서 n개 건너뛰기
	 //limit(long maxSize)
	 //filter(Predicate predicate)
	 //distinct() 중복제거
	 IntStream intStream4 = IntStream.rangeClosed(0, 20); 
	 intStream4.filter(i->i%2==0 && i%3==0).sorted().forEach(System.out::println);// filter 두번써도됨
	 
	 
	}
}
