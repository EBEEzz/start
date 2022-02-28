package day04.ex;

/*
 	문제 1)
 	1 ~ 25 사이의 숫자 3개를 랜덤하게 발생시켜서 
 	가장 큰 수만 출력하는 프로그램을 작성하세요.
 	단, 3항연산자를 사용해서 처리하세요.
 */

public class Ex01 {
	
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 25 - 1 + 1) + 1;
		int num2 = (int)(Math.random() * 25 - 1 + 1) + 1;
		int num3 = (int)(Math.random() * 25 - 1 + 1) + 1;
		
		//Method01
		String result = (num1 > num2) ? ((num1 > num3) ? ("가장 큰 수는 " + num1 + " 입니다.") : ("가장 큰 수는 " + num3 + " 입니다.")) : 
			((num2 > num3) ? ("가장 큰 수는 " + num2 + " 입니다.") : ("가장 큰 수는 " + num3 + " 입니다."));
		
		System.out.println("랜덤발생된 세 정수 " + num1 + ", " + num2 + ", " + num3 + " 중\n" + result);
		
		/* 
		 	참고) 문자열을 표현할 때 문자열 안에 " 기호를 출력하는 방법
		 	=> \"		이때 사용한 \를 이스케이프문자라고 부른다.
		 	
		 		많이 사용하는 문자들
		 			\"		//문자열 내에 " 를 표현한다.
		 			\n		//한 줄 내림기호
		 			\r		//캐리지리턴
		 			\t		//tab을 표현
		 			\b		//backspace
		 */
		
		//Method02
		int max = 0;
		
		if(num1 >= num2 && num1 >= num3) {
			max = num1;
		} else if(num2 > num1 && num2 >= num3) {
			max = num2;
		} else max = num3;
		
		System.out.println("랜덤발생된 세 정수 : " + num1 + ", " + num2 + ", " + num3 + "중\n"
				+ "가장 큰 수는 " + max + "입니다.");
	}
}
