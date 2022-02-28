package day04.ex;

/*
 	1. 알파벳을 입력받아서 그 문자가 대문자인지 소문자인지 판별하는 프로그램.
 	
 	2. 숫자 또는 알파벳을 입력받아서 그 문자가 숫자인지 대문자인지
 	소문자인지 판별하는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex0201 {
	
	public static void main(String[] args) {
		
		//입력도구
		Scanner sc = new Scanner(System.in);
		
		//입력문자 출력
		System.out.print("문자를 입력하세요 : ");
		
		//입력문자 변수에 저장
		String str = sc.nextLine();
		
		//문자 추출
		char ch = str.charAt(0);
		
		String result = "숫자나 알파벳을 입력해주세요!";
		
		if (ch >= 'A' && ch <= 'Z') {
			result = "입력된 문자 " + ch + "은(는) 대문자이다.";
			System.out.println(result);
		}
		
		else if (ch >= 'a' && ch <= 'z') {
			result = "입력된 문자 " + ch + "은(는) 소문자이다.";
			System.out.println(result);
		}
		
		else if (ch >= '0' && ch <= '9') {
			result = "입력된 문자 " + ch + "은(는) 숫자이다.";
			System.out.println(result);
		}
		
		else System.out.println(result);
		
	}

}
