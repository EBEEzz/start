package day14.ex;
/*
	문제 1 ]
		원의 정보를 기억할 클래스를 제작하세요.
		가지는 정보는 
			반지름, 면적, 둘레
		를 가지고
		기능은 변수에 접근할 수 있는 함수들..
		그리고 반지름이 같으면 같은 원으로 처리해주는 기능의 
			equals()
		함수로 오버라이드 하고,
		이클래스 타입의 변수를 출력하면 해당 원의 정보를 출력해주는 함수도 오버라이드 하세요.
*/
public class Ex01 {
	private int rad;
	double area, arround;
	
	public Ex01() {
		
	}
	
	public Ex01(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	
	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getArround() {
		return arround;
	}

	public void setArround(double arround) {
		this.arround = arround;
	}

	public static void main(String[] args) {

		new Ex01();
	}
}
