package 실습문제;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		// 배열 생성 및 초기화
		int[] arrMoney = {50000,10000,5000,1000,500,100,50,10,1};
		String[] str= {"오만원권","만원권","오천원권","천원권","오백원","백원",
				"오십원","십원","일원"};
	           int[] result =new int[9]; //0으로 자동초기화됨
	    //입력단계
	    System.out.print("금액을 입력하세요>>>");
	    Scanner scan = new Scanner(System.in);
	    int Money = scan.nextInt();
	    
	    //처리단계
	    for(int i=0; i<arrMoney.length; i++) {
	    	while(Money>=arrMoney[i]) {
	    		Money=Money-arrMoney[i];
	    		 result[i]=result[i]+1;
	    	}
	    }
//      for(int j=0;j<arrMoney.length;j++) {
//	    	System.out.println(str[j]+":"+result[j]+"개");
//	    }
	    for(int j=0;j<arrMoney.length;j++) {
	    	if(result[j]!=0) {
	    		if(j<4) {
	    			System.out.println(str[j]+":"+result[j]+"매");
	    		}else {System.out.println(str[j]+":"+result[j]+"개");
	    		}
	    		}
	    	}
	    }
	
	}
		
	
	


