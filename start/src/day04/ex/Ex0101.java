package day04.ex;

/*
	문제 1 - 1)
	1 ~ 25 사이의 숫자 3개를 랜덤하게 발생시켜서 
	큰 수, 중간수, 작은수를 구분하여 출력하는 프로그램을 작성하세요.
	단, 3항연산자를 사용해서 처리하세요.
*/

public class Ex0101 {
	
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 25 - 1 + 1) + 1;
		int num2 = (int)(Math.random() * 25 - 1 + 1) + 1;
		int num3 = (int)(Math.random() * 25 - 1 + 1) + 1;
		
		//Method01
		String result = (num1 > num2) ? ((num1 > num3) ? ((num2 > num3) ? ("큰 수 : " + num1 + "\n중간수 : " + num2 + "\n작은수 : " + num3)
				: ("큰 수 : " + num1 + "\n중간수 : " + num3 + "\n작은수 : " + num2))
				: ("큰 수 : " + num3 + "\n중간수 : " + num1 + "\n작은수 : " + num2))
				: ((num2 > num3) ? ((num1 > num3) ? ("큰 수 : " + num2 + "\n중간수 : " + num1 + "\n작은수 : " + num3)
						: ("큰 수 : " + num2 + "\n중간수 : " + num3 + "\n작은수 : " + num1))
						: ("큰 수 : " + num3 + "\n중간수 : " + num2 + "\n작은수 : " + num1));
		
		System.out.println(result);
		
		//Method02
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if(num1 >= num2 && num1 >= num3) {
			max = num1;
			if(num2 >= num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
		} else if(num2 > num1 && num2 >= num3) {
			max = num2;
			if(num1 >= num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}
		} else {
			max = num3;
			if(num1 >= num2) {
				mid = num1;
				min = num2;
			} else {
				mid = num2;
				min = num1;
			}
		}
		System.out.println("큰 수 : " + max + "\n중간수 : " + mid + "\n작은수 : " + min);
	}

}
