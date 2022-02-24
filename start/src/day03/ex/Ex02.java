package day03.ex;

/*
	문제 2)
	하나의 숫자를 입력받은 후(원의 반지름)
	그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
		
		참고) 원의 넓이 : pi * r^2
				원의 둘레 : 2 * pi * r
 */

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름 : ");
		
		double radius = sc.nextDouble();
		
		System.out.println();
		System.out.println("원의 넓이 : " + (3.14 * radius * radius));
		System.out.println("원의 둘레 : " + (2 * 3.14 * radius));
	}

}
