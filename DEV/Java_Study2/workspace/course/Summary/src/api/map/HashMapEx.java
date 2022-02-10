package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// HashMap -키,값 같이 저장. 키를 알고 있다면 조회가 빠르다.
		
		//HashMap<Integer, String> map = new HashMap<>();
        Map<Integer,String> map = new HashMap<>();
        //put() -추가
        map.put(1,"홍길동");
        map.put(2,"이순신");
        map.put(3,"홍길자");
        map.put(4,"홍길동");
        
        
       //size() -크기확인
        System.out.println("맵의크기:" + map.size());
        
        //toString() - 문자열로 확인
        System.out.println(map.toString());
        //동일한 키가 들어오면 값을 변경합니다.
         map.put(1,"신사임당");
         System.out.println(map.toString());
         
         //get() 조회
         String name = map.get(1);
         System.out.println("1번 키에대한 값:"+ name);
         
         //Map의 순차적 반복 - entrySet은 map 의 entry를 set으로 변형합니다.
         Set<Entry<Integer ,String>> set = map.entrySet();
         
         System.out.println(set);
         
         for(Entry<Integer ,String > a:set) {
        	 System.out.println("키:" + a.getKey());
        	 System.out.println("값:" + a.getValue() );
        	 
         }
         
         //containsKey() - 키의 확인
         if(map.containsKey(1)) {
        	 System.out.println("키가 존재합니다.");
         }
         
         //remove() -삭제
         map.remove(1);
         System.out.println(map.toString());
         
 }
}