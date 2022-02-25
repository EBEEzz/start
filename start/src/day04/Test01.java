package day04;

/*
	정수 하나를 입력받아서 이 수가 0인지 홀수인지 짝수인지를 판별하세요.
	
	참고) 조건문
		
		if(조건식) {
			(실행내용)	//조건식이 참일 경우 실행하는 부분
		}
*/

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		/*
		 	< 할 일 >
		 	입력도구 준비하고
		 	입력받기전에 입력메세지 출력
		 	입력받아서 정수를 변수에 기억
		 	조건에 따라 판별
		 	내용 출력
		 */
		Scanner sc = new Scanner(System.in);	//입력도구 준비
		
		System.out.print("정수 입력 : ");		//입력받기전에 입력메세지 출력
		
		int num = sc.nextInt();					//입력받아서 정수를 변수에 기억
		
		//조건에 따라 판별
		String soo = "[영]";						//입력된 정수가 0일 때
		if(num % 2 != 0) {						//입력된 정수가 홀수
			soo = "홀수";
		}
		if(num != 0 && num % 2 == 0) {			//입력된 정수가 짝수
			soo = "짝수";
		}
		
		System.out.println("입력받은 정수 " + num + "은(는) " + soo + "입니다.");
	}

}
