package day03;

public class Test05 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 20;
		
		int no3 = no1++ + no2;	//변수++은 연산에는 바로 반영되지 않는다.
		
		int no4 = no1 + ++no2;	//++변수는 바로 연산에 반영된다.
		
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		System.out.println("no3 : " + no3);
		System.out.println("no4 : " + no4);
	}
}
