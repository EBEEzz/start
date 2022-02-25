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
		
		String result = (num1 > num2) ? ((num1 > num3) ? ("가장 큰 수는 " + num1 + " 입니다.") : ("가장 큰 수는 " + num3 + " 입니다.")) : 
			((num2 > num3) ? ("가장 큰 수는 " + num2 + " 입니다.") : ("가장 큰 수는 " + num3 + " 입니다."));
		
		System.out.println(result);
		
		/*
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		*/
	}

}
