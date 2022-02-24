package day03.ex;

/*
	문제 3)
		84232원을 지불하려고 한다.
		우리나라 화폐단위로 이 금액을 지불하려면
		각 단위가 몇개씩 필요한지 계산해서 출력하세요.
		
		< 화폐단위 >
		50000원권
		10000원권
		5000원권
		1000원권
		500원
		100원
		50원
		10원
		1원
 */

import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지불하려는 금액 : ");
		
		int total = sc.nextInt();
		int tmp = total;
		
		int a = tmp / 50000;
		tmp = tmp % 50000;		//tmp %= 50000; 으로 작성해도 무방.
		
		int b = tmp / 10000;
		tmp = tmp % 10000;
		
		int c = tmp / 5000;
		tmp = tmp % 5000;
		
		int d = tmp / 1000;
		tmp = tmp % 1000;
		
		int e = tmp / 500;
		tmp = tmp % 500;
		
		int f = tmp / 100;
		tmp = tmp % 100;
		
		int g = tmp / 50;
		tmp = tmp % 50;
		
		int h = tmp / 10;
		
		int i = tmp % 10;
		
		
		System.out.println("50000원권 : " + a);
		System.out.println("10000원권 : " + b);
		System.out.println("5000원권 : " + c);
		System.out.println("1000원권 : " + d);
		System.out.println("500원권 : " + e);
		System.out.println("100원권 : " + f);
		System.out.println("50원권 : " + g);
		System.out.println("10원권 : " + h);
		System.out.println("1원권 : " + i);
	}

}
