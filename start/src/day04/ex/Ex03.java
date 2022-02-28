package day04.ex;

/*
 	문제 3)
 	게시물을 게시판에 출력하는데 하나의 페이지에 게시물 15개를 출력할 예정이다.
 	게시물 수를 랜덤하게 발생시켜서 게시판의 페이지가 몇 페이지 필요한지
 	출력해주는 프로그램을 작성하세요.
 	
 		참고) 게시물이 없더라도 적어도 1페이지는 필요하다.
 */

public class Ex03 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 100 - 1 + 1) + 1;
		
		//Method01
//		int soo = (num % 15 == 0) ? (num / 15) : ((num / 15) + 1);
		
		//Method02
		int soo = 0;
		if(num % 15 == 0) {
			soo = num / 15;
		} else {
			soo = (num / 15) + 1;
		}
		
		System.out.println("게시물의 수는 " + num + " 개이므로, " 
				+ "필요한 게시판의 페이지는 " + soo + " 페이지이다.");
	}

}
