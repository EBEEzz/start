package day12;

public class Dongle extends Figure {
	private int rad;
	private double arround, area;
	
	//생성자
	public Dongle() {};
	
	public Dongle(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	
	@Override
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	@Override
	public void toPrint() {
		System.out.printf("이 원은 반지름이 %2d이고 둘레가 %6.2f이고 면적이 %6.2f입니다.\n", rad, arround, area);
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
}
