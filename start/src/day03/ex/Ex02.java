package day03.ex;

/*
	문제 2)
	하나의 숫자를 입력받은 후(원의 반지름)
	그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
		
		참고) 원의 넓이 : pi * r^2
				원의 둘레 : 2 * pi * r
 */

import java.util.*;
//이렇게 사용할 클래스의 경로를 지정하면 java.util 패키지 하위에 속한 클래스의 사용이 준비된다.
//이 예제의 경우 Scanner를 사용할 예정인데 * 대신 직접 Scanner를 명시해도 된다.

//* 를 사용한 방법보다 클래스 이름을 명시하는 방법이 우선 적용된다.

public class Ex02 {
	public static void main(String[] args) {
		
		/*
			< 할 일 >
			입력도구 준비
			입력받기 전 메세지 출력
			입력받고, 변수에 기억
			계산
			출력
		 */
		
		Scanner sc = new Scanner(System.in);	
		//System.in 은 컴퓨터와 외부장치(키보드, 마우스, ...)가 연결되는 통로같은 느낌
		
		System.out.print("원의 반지름 : ");
		
		int radius = sc.nextInt();
		double pi = 3.14;
		
		double s = pi * radius * radius;
		double l = 2 * pi * radius;
		
		System.out.println();
		System.out.println("원의 넓이 : " + s);
		System.out.println("원의 둘레 : " + l);
		
		/*
			참고) 형변환에서 큰 타입의 데이터를 작은 타입으로 변환하면 남는 부분은 버린다.
		 */
	}

}
