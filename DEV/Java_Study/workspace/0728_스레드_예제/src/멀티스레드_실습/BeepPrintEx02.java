package ��Ƽ������_�ǽ�;
/*
 * ���ν����� ����
 */

import java.awt.Toolkit;

public class BeepPrintEx02 {
	//���ν����� 

	public static void main(String[] args) {
    //[���1]
		/*
    //�������̽� �̸�  ��������    =new  ������();
	  Runnable beepTask = new BeepTask();
      Thread thread = new Thread(beepTask);
      
      
     
      //�� �������� �۾������带 ���۽��Ѷ� =>���ν����� �۾������尡 ���ÿ� ����
      thread.start();
      
      for(int i=0;i<5;i++) {
			System.out.println("��");
			try {Thread.sleep(1000);}
			catch(Exception e) {
				
			}
		}	*/
      //[���2] �߿�
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() { Toolkit toolkit = Toolkit.getDefaultToolkit(); //��ü���
	        
			for(int i=0; i<5;i++) {
				toolkit.beep();  //������ �߻�
				try {Thread.sleep(1000);}//1�ʰ� �Ͻ� ����
				catch(Exception e) {
					
				}
			 
			 }
			}
		});
		thread.start();
		 for(int i=0;i<5;i++) {
				System.out.println("��");
				try {Thread.sleep(1000);}
				catch(Exception e) {
					
				}
		 }
		
      
	}
    
}
