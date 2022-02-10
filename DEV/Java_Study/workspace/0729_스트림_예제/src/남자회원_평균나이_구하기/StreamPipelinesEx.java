package ����ȸ��_��ճ���_���ϱ�;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelinesEx {

	public static void main(String[] args) {
		//Member ��ü����
		List<Member> list = Arrays.asList(new Member("�����",Member.MALE,30),
				                          new Member("�迬��",Member.FEMALE,28),
				                          new Member("�̰���",Member.MALE,26),
				                          new Member("���翵",Member.FEMALE,29),
				                          new Member("����ö",Member.MALE,32)
				);
      double sum = 0.0;
      int count= 0;
      //[�ذṮ��] '����' ȸ���� ������ �հ踦 ���Ͻÿ�.
      //[��Ʈ] for��, ���ϴ� ��ü�� �������� �޼ҵ尡 list.get(i)
      
     /* for(int i=0;i<5;i++) {
    	  if (list.get(i).getGender()==0) {
    	 count= list.get(i).getAge();
    	  sum +=count;}
      } 
     
      
      System.out.println(sum);
      
	}*/
      //Ȯ��� for�� => �ڹ�5�������� �߰��� ����
      //[����] for(Ŭ������ ����:��������)
     
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
    * ���ٽİ� ��Ʈ���� �����Ͽ� �ذ�����!
    * 
    * 
    * 
    * �������������ڹ��ڵ�� ǥ���ϱ�
    */
      Stream<Member> maleFemaleStream = list.stream();
      Stream<Member> maleStream 
        = maleFemaleStream.filter(m->m.getGender()==Member.MALE);
      IntStream ageStream = maleStream.mapToInt(Member::getAge);
      OptionalDouble optionalDouble = ageStream.average();
      double ageAvg=optionalDouble.getAsDouble();
      
      /*
       * �� �ҽ����� ���ú����� �����ϰ� �����Ѹ� ������ ���� ���������� �ڵ常 ���´�.
      double ageAvg= list.stream()//�÷������κ��� ��Ʈ�� ���
    		         .filter(m->m.getGender()==Member.MALE)
    		         .mapToInt(Member::getAge)
    		         .average()  //����ó�� ��Ʈ��
                     .getAsDouble();  ///����� ��������*/
      
      
   System.out.format("���� ȸ���� ��ճ���:"+"%.2f",ageAvg);
   
   //�Ҽ��� ���� 3�ڸ������� ����ϰ��� �Ҷ�
	}
}
