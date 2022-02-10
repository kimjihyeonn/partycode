package api.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		//list - 순서 o , 중복값 o
		
		//ArrayList<String> list = new ArrayList<>();
		List<String> list=new ArrayList<>();
		
		//add()추가
		
		list.add("소고기");
		list.add("돼지고기");
		list.add("닭고기");
		list.add("물고기");
		
		//size() 크기확인
		System.out.println("리스트크기:"+list.size());
		//toString()
		
		System.out.println(list.toString());
		
		//add(인덱스,값) 
		list.add(3, "양고기");
		System.out.println(list.toString());
		//get()
		String name=list.get(3);
		System.out.println(name);
		
		//remove() 삭제
		list.remove(4);
		
		System.out.println(list.toString());
		
		//contains() 값의 여부
		if(list.contains("양고기")) {
			System.out.println("값이 존재합니다.");
		}
		System.out.println("----------------------------------------");
		 //배열을 리스트로 변환 Arrays. asList
		String[] arr = {"홍길동2" , "이순신2"};
		List<String> list2=Arrays.asList(arr);
		
		list.addAll(list2);
		
		System.out.println(list.toString());
		
	}

}
