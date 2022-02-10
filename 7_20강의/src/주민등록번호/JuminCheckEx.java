package 주민등록번호;

import java.util.Calendar;
import java.util.Locale;
/**
 * 정규표현식(Regular Expression; 약자로regex)란?
 * =>입력된 문자열이 정해져 있는 형식으로 되어 있는지 검증하는 것을 말한다.
 *   이미 약손된 메타문자를 제공해준다.
 *   *메타문자란?
 *   =>원래 그 문자가 가진 뜻이 아닌 '특별한 용도'로 사용되는 문자를 말한다.
 *   []=>한 개의 문자 (예) [abc] =>a,b,c 중 하나의 문자
 *                    [0-9] => 0에서 9까지 중 하나
 *   
 *   {} => 반복횟수  (예) {6}    =>6번 반복개념 
 *   ^ => 시작 ,$=>종료
 *   
 *   #주민번호 코드로 부터 중요 정보를 추출하는 방법
 *   나이
 *   성별
 *   생년월일
 *   출신지역
 *   띠
 *   마케팅 정책에 적용하기 위해서 => promotion
 *   ------------------------------------
 *   
 *   
  */
import java.util.Scanner;
import java.util.regex.Pattern;

public class JuminCheckEx {

	public static void main(String[] args) {
		//준비단계
		int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5};//가중치 초기화
		String juminNum; //juminNum입력받은 주민번호 문자열 객체를 가리키는 참조(주소)변수이다.
		int sum = 0; //누계 변수는 0으로 초기화 하자.
		int temp, result;
		
		//입력
		System.out.print("주민번호 입력>>>> ");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.next();
		
		//[가정]"791024-1035271"
		/*
		 * 주민번호를 입력받으면 가장 먼저 유효성 체크를 하자!!
		 * 정규표현식(Regular Expression=regex) 패턴 적용을 통해서
		 */
		String regex = "^[0-9]{2}([0][1-9]|[1][0-2])([0][1-9]|[12][0-9]|[3][01])-[1234][0-9]{6}$";
		
		//matches,compareTo,charAt,equals
		//boolean check = juminNum.matches(regex);
		boolean check = Pattern.matches(regex, juminNum);
		
		if(check == false) {
			System.out.println("입력된 주민번호는 정규표현식 패턴에 맞지 않습니다.");
			return;
		}
		System.out.println("입력된 주민번호는 정규 표현식 패턴에 적합합니다.");
		//처리
		
	/*	for(int i=0;i<13;i++) {
			if(juminNum.charAt(i) =='-'){
				continue;
			}else {
				sum = sum + (juminNum.charAt(i)-48) * weight[i];
			}
			
		}*/
		
		for(int i=0;i<weight.length;i++) {
			if(juminNum.charAt(i) =='-')continue;
			 sum = sum + (juminNum.charAt(i)-48) * weight[i];
			}
			//System.out.println(sum);
		temp= 11-(sum%11);
		result = temp%10;
		if(result == juminNum.charAt(13)-48) {
			System.out.println("주민번호 정상입니다.");
			/*
			 * #나이 추출하기 => 시나리오가 나와야 한다.
             *   1.시스템으로 부터 현재 년도 얻어내기 => 2021
             *   2.주민번호의 앞 두자리 가져오기=> "97"=>정수 97로 변환
             *   3.주민번호의 7번짜자리 가져오기
             *   1,2면 +1900, 3,4면 +2000
             *   4.2021-1997= 나이
			 */
			Calendar cal= Calendar.getInstance(Locale.KOREA);
			int year = cal.get(Calendar.YEAR); //2021 얻음
			//substring(0,2)의 의미는 end index(2) - beginIndex(0)를 뺀 자리수 만큼 얻어오기
			//charAt,matches,equals,substring,comepareTo
			int yy= Integer.parseInt(juminNum.substring(0,2));//"97"=>정수97
			if((juminNum.charAt(7)-'0') < 3) {
				yy = yy+1900;
				
			}else
			{
				yy= yy+2000;
			}
			int age= year-yy+1; // 나이 추출
			System.out.println("나이 :"+age);
			
			//'성별' 추출
			if((juminNum.charAt(7)-'0')%2 == 0) { //2,4인 경우 =>여자
				System.out.println("성별 : 여자");
				
			}else {
				System.out.println("성별 : 남자");
			}
			
			//'출신지역' 추출
			/*서울:00~08
			 * 부산:09~12
			 * 인천:13~15
			 * 경기:16~25
			 * 강원:26~34
			 * 충북:35~39
			 * 대전:40
			 * 충남:41~43,45~47
			 * 세종:44,96
			 * 전북:48~54
			 * 전남:55~64
			 * 광주:65~66
			 * 대구:67~70
			 * 경북:71~80
			 * 경남:81~84,86~90
			 * 울산:85
			 * 제주:91~95(특별자치도)
			 * 
			 */
			
			//2차원 배열로 초기화 시키기
			String[][] localeCode = {{"서울","00","08"},{"부산","09","12"},{"인천","13","15"},{"경기","16","25"},
			{"강원","26","34"},{"충북","35","39"},{"대전","40","40"},{"충남","41","43"},{"충남","45","47"},{
				"세종","44","44"},{"세종","96","96"},{"전북","48","54"},{"광주","65","66"},{"대구","67","70"}
				,{"경북","71","80"},{"경남","81","84"},{"경남","86","90"},{"울산","85","85"},{"제주","91","95"}
			};
			
			String localeString = juminNum.substring(8, 10);
			int locale = Integer.parseInt(localeString);
			String birthPlace = null;
			
			for(int j=0;j<=localeCode.length-1;j++) {
				if(locale >=Integer.parseInt(localeCode[j][1]) && locale <=Integer.parseInt(localeCode[j][2])) {
					birthPlace = localeCode[j][0];
					
				}
				
			}
			System.out.println("출신지역:"+birthPlace);
			
			//'생년월일 출력'
			
		
			
			System.out.println("생년월일:" +yy+"/"+juminNum.substring(2,4)+"/"+juminNum.substring(4,6));
			
			
			//'띠' 추출 => 출생년도를%12 =값으로 결정 
			String ddi = null;
			String[] gangi = {"원숭이","닭","개","돼지","쥐","소","범","토끼","용","뱀","말","양"};
			ddi = gangi[yy%12];
			System.out.println("띠:"+ddi);
			
		}else {
			System.out.println("틀린 주민등록 번호입니다.");
		}
		}
		
		
		
  

	}


