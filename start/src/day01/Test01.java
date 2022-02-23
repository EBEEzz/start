package day01;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("내가 만든 첫번째 자바 클래스!!!");
		
		Test01 t1 = new Test01(); //static이 없는 abc()를 메모리에 올리는 작업
		t1.abc(); //abc() 실행
		
		Test01.xyz(); //Test01 클래스에 있는 xyz()를 실행
		
	}
	
	public void abc() {}
	
	public static void xyz() {}
	
	//CTRL + SHIFT + F11을 눌러 실행
	
	/*static 멤버는 static 영역의 클래스가 실행되는 순간
	메모리에 먼저 올려진다.*/
}
