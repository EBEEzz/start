package day03.ex;

/*
	문제 4)
	1년은 365.2426일이다. 이것은 며칠 몇시간 몇분 몇초인지 계산하고 출력하세요.
	
	힌트) 365.2426일은 일 단위로 하루는 24시간이다.
			따라서 0.5일은 12시간을 의미한다.
 */
public class Ex04 {
	public static void main(String[] args) {
		
		int day = 365;
		
		int time = (int)(0.2426 * 24 * 60 * 60);
		
		int second = time % 60;
		time = time / 60;
		
		int minute = time % 60;
		time = time / 60;
		
		int hour = time % 24;
		
		System.out.print(day + "일 ");
		System.out.print(hour + "시간 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초");
		
	}

}
