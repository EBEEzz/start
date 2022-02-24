package day03.ex;
/*
	문제 1)
		두개의 숫자를 입력받은 후 (가로, 세로)
		그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를 구하고
		결과를 출력하세요.
		
		출력형식)
			가로 : XXXX
			세로 : XXXX
			사각형 넓이 : XXXXX
			삼각형 넓이 : XXXXX.X
			
	참고) 자바에서 * 기호의 의미는
			연산자로서 곱하기의 의미
			'모든 것'을 의미
 */

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//입력도구의 준비
		
		System.out.print("가로 : ");			//메세지 출력
		
		/*
		String garo = sc.nextLine();			//문자열로 입력받는 방법
		int width = Integer.parseInt(garo);		//정수형태의 문자열을 정수로 변환하는 방법	Integer.parseInt(문자열);
		*/
		
		//정수로 입력받는 방법	int 변수이름 = sc.nextInt();
		int width = sc.nextInt();
		
		//System.out.println("입력된 가로 : " + garo);	//출력
		
		System.out.println("가로 : " + width);
		
		System.out.print("세로 : ");			//메세지 출력
		int height = sc.nextInt();
		
		System.out.println("입력된 세로 : " + height);
		
		int square = width * height;
		double tri = width * height * 0.5;
		
		System.out.println("사각형 넓이 : " + square);
		System.out.println("삼각형 넓이 : " + tri);
	}

}
