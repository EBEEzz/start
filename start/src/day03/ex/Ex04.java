package day03.ex;

/*
	문제 4)
	1년은 365.2426일이다. 이것은 며칠 몇시간 몇분 몇초인지 계산하고 출력하세요.
	
	힌트) 365.2426일은 일 단위로 하루는 24시간이다.
			따라서 0.5일은 12시간을 의미한다.
 */
public class Ex04 {
	public static void main(String[] args) {
		
		/*
		 	< 할 일 >
		 	데이터 변수에 기억
		 	누적계산될 변수 만들고
		 	날 수 구하고 -> 누적 변수에 계산해서 업데이트
		 	시간 구하고 -> 누적 변수에 계산해서 업데이트
		 	분 구하고 -> 누적 변수에 계산해서 업데이트
		 	초 구하고
		 	출력
		 */
		double total = 365.2426;
		
		int day = (int)total;
		double tmp = total - day;
		
		int time = (int)(tmp * 24 * 60 * 60);
		
		int second = time % 60;
		time /= 60;
		
		int minute = time % 60;
		time /= 60;
		
		int hour = time % 24;
		
		System.out.print(day + "일 ");
		System.out.print(hour + "시간 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초");
		
	}

}
