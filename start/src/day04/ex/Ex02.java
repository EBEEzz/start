package day04.ex;

/*
 	문제 2)
 	문자를 임의로 랜덤하게 입력한 후,
 	그 문자가 대문자이면 소문자로 소문자이면 대문자로 변환하고
 	만약 특수문자이면 그 문자 그대로 출력하는 프로그램을 작성하세요.
 	(3항연산자로 해보기)
 	
 		참고) 아스키 코드는
 		특수문자 - 숫자(0 ~ 9) - 특수문자 - 영문대문자
 		- 특수문자- 영문소문자 - 특수문자
 		
 		참고) 문자열에서 문자를 추출하는 방법
 			문자열.charAt(위치값);		//이때 위치값은 0부터 시작한다.
 			
 			예) abcd에서 두번쨰 문자를 추출하려면
 				"abcd".charAt(1); => 'b'
 */

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		//< 할 일 >
		
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		//메세지 출력
		System.out.print("문자 입력 : ");
		
		//입력받아 문자열 저장
		String str = sc.nextLine();
		
		//자원 반환
		sc.close();
		
		//문자열에서 문자 추출
		char ch = str.charAt(0);
		
		//판별 (판별결과는 변수에 담아서 처리)
		//Method01
//		char result = (ch < 'A' || (ch > 'Z' && ch < 'a') || ch > 'z') ? (ch) : 
//				((ch <= 'Z') ? ((char) (ch + ('a' - 'A'))) : ((char) (ch - ('a' - 'A'))));
		
		//Method02
		char result = '0';
		if(ch >= 'A' && ch <= 'Z') {				//대문자일 때
			result = (char)(ch + ('a' - 'A'));
		} else if(ch >= 'a' && ch <= 'z') {			//소문자일 때
			result = (char)(ch - ('a' - 'A'));
		} else result = ch;							//특수문자일 때	
		
		//결과
		System.out.println(result);
	}

}
