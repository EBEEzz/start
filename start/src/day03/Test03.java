package day03;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
		System.out.println('J' + 3.14);	//J가 아스키 코드 값으로 변환됨.
		
		//'J' 이후의 열번째 문자는 무엇인지 출력
		JOptionPane.showMessageDialog(null, "J 이후의 열번째 문자 : " + (char)('J' + 10));
	
		/*
		 	혹은 
			
			String msg = "J 이후의 열번째 문자 : " + (char)('J' + 10);
			JOptionPane.showMessageDialog(null, msg);
			
			로 변수를 사용할 수 있다.
		*/
		 
		
	}

}
