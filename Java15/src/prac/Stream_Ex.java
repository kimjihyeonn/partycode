package prac;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Ex {
	
	public static void main(String[] args) {
		String[] strArr = {"a","b","c","d"};
		
		Stream<String> strStream = Arrays.stream(strArr);
         
		strStream.forEach(System.out::print);
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(System.out::println);
		System.out.println(intStream.count());
		IntStream intStream3 = Arrays.stream(intArr);
		System.out.println(intStream3.sum());
		
		Integer[] intArr2 = {1,2,3,4,5};
		Stream<Integer> intStream2 = Arrays.stream(intArr2);
		intStream2.forEach(System.out::println);
		//IntStream 기본형은 sum count,average있음녀
		//Stream<T> 는 count만 반환가능하나 sum,average없음 ,숫자 스트림 다룰땐
	
		
	}
}
