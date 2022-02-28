package day04.ex;
/*
	문제 5)
	3자리 숫자(100 ~ 999)를 입력받아서
	이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
	얼마가 필요한지 계산해서 출력해주는 프로그램을 작성하세요.
	조건문 사용
	
		예) 241은 200에 가까우므로 41을 빼야한다.
			777은 800애 가까우므로 23을 더해야한다.
			0 ~ 50 => 0		51 ~ 99 => 100
*/
import javax.swing.JOptionPane;

public class Ex0501 {

	public static void main(String[] args) {
		//세자리 정수를 입력받는다.
		String sno = JOptionPane.showInputDialog("세자리 정수 입력 :");
		//입력받은 데이터는 정수형태의 문자열이므로 정수로 변환해줘야 한다.
		//정수형태의 문자열을 정수로 변환해주는 기능의 함수	Integer.parseInt(문자열);
		int no = Integer.parseInt(sno);
		
		//10단위 이하만 추출해낸다.
		int num = no % 100;
		
		//num이 50보다 큰지 판별
		
		int hap = 0;
		int result = 0;
		String str = "0";
		
		if(num > 50) {
			hap = 100 - num;
			result = no + hap;
			str = "더해줘야한다.";
			
		} else {
			hap = num;
			result = no - hap;
			str = "빼줘야한다.";
		}
		//출력
		System.out.println("입력한 정수 " + no + "은(는) " + result
				+ "에 가까우므로 " + hap + "을(를) " + str);
	}

}
