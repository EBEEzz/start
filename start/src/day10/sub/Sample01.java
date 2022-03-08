package day10.sub;

import day10.*;

public class Sample01 {
	private int num1, num2, num3, num4;		//은닉화
	
	//day10.Test01의 멤버 변수를 읽어서 위 변수에 셋팅하는 함수
	public void setNum() {
		//힙에 객체만들고
		Test01 t1 = new Test01();
		
//		num1 = t1.no1;	//no1의 접근지정자는 private으로 지정되어있어서 사용불가능
//		num2 = t1.no2;	//no2는 같은 패키지만 접근가능하도록 접근지정자가 생략되었으므로 접근불가능
//		num3 = t1.no3;	//no3는 Test01을 상속받은 클래스거나 같은 패키지에서만 사용가능하므로 접근불가능
		num4 = t1.no4;	//no4는 모든 곳에서 사용가능하므로 접근가능 (public)
	}
}
