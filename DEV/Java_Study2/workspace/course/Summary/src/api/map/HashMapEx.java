package api.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// HashMap -Ű,�� ���� ����. Ű�� �˰� �ִٸ� ��ȸ�� ������.
		
		//HashMap<Integer, String> map = new HashMap<>();
        Map<Integer,String> map = new HashMap<>();
        //put() -�߰�
        map.put(1,"ȫ�浿");
        map.put(2,"�̼���");
        map.put(3,"ȫ����");
        map.put(4,"ȫ�浿");
        
        
       //size() -ũ��Ȯ��
        System.out.println("����ũ��:" + map.size());
        
        //toString() - ���ڿ��� Ȯ��
        System.out.println(map.toString());
        //������ Ű�� ������ ���� �����մϴ�.
         map.put(1,"�Ż��Ӵ�");
         System.out.println(map.toString());
         
         //get() ��ȸ
         String name = map.get(1);
         System.out.println("1�� Ű������ ��:"+ name);
         
         //Map�� ������ �ݺ� - entrySet�� map �� entry�� set���� �����մϴ�.
         Set<Entry<Integer ,String>> set = map.entrySet();
         
         System.out.println(set);
         
         for(Entry<Integer ,String > a:set) {
        	 System.out.println("Ű:" + a.getKey());
        	 System.out.println("��:" + a.getValue() );
        	 
         }
         
         //containsKey() - Ű�� Ȯ��
         if(map.containsKey(1)) {
        	 System.out.println("Ű�� �����մϴ�.");
         }
         
         //remove() -����
         map.remove(1);
         System.out.println(map.toString());
         
 }
}