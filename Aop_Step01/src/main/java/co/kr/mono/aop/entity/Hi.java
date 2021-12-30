package co.kr.mono.aop.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Hi {
	
public static void main(String[] args) {
	
List<String> wildList = new ArrayList<String>();

wildList.add("dd");
wildList.add("ddd");
System.out.println(wildList.toString());

List<String> intList = new ArrayList<String>();

intList.add("4");

intList.addAll(wildList);
hello(wildList,intList);
    
	
}

 static void hello(List<?> wildList,List<?> b) {
	System.out.println(wildList.toString());
	System.out.println(b.toString());
 }
	
}
