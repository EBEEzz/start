package day05;
/*
 	나이를 입력받아서 유년기, 10대, ..., 40대, 장년층으로 구분해서 출력하세요.
 */

import java.util.*;

public class Test04 {

	public static void main(String[] args) {
		//조건이 여러가지인 경우는 if ~ else if 구문으로 처리하는 것이 편하다.
		
		//입력도구준비
		Scanner sc = new Scanner(System.in);
		//메세지출력
		System.out.print("나이 입력 : ");
		//입력받아 변수에 기억
		int age = sc.nextInt();
		//판별과 결과기억
		String sage = "장년층";
		
		if (age < 10) {
			sage = "유년기";
		} else if (age < 20) {
			sage = "10대";
		} else if (age < 30) {
			sage = "20대";
		} else if (age < 40) {
			sage = "30대";
		} else if (age < 50) {
			sage = "40대";
		} else {
			sage = "장년층";
		}
		
		//출력
		System.out.println("입력한 나이 " + age + "세의 연령층은 " + sage + "이다.");
		
	}

}
