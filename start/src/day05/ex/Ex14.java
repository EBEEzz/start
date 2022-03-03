package day05.ex;
/*
문제 14)
	다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
	
	1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
	2. 첫번째 숫자(a)가 마지막 숫자(d)보다 2 큼
		a : 3 <=
			9 >=
			
		d : 1 <=
			7 >=
	
	3. 두번째 숫자(b)가 세번째 숫자(c)보다 크다.
		b > c => c + 1 부터 시작
		
	4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456이 된다.
	
		a	b	c	d
	+	d	c	b	a
	=>	16456
*/
public class Ex14 {

	public static void main(String[] args) {
		int a, b, c, d;
		int result = 0;
		
		loop:
		for(a = 3; a <= 9; a++) {
			d = a - 2;
			for(b = 2; b < 10; b++) {
				if(b == a || b == d) {
					continue;	//같은 숫자가 발생한 경우(조건에 부합하지 않음) 새로운 b를 탐색
				}
				//b가 a, d와 같지 않은 경우 이 라인을 실행
				for(c = 1; c < b; c++) {
//					if(c >= b) {
//						//이 회차 포함 이후 회차는 모두 조건에 위배되므로 작업종료.
//						break;
//					}
					if(c == a || c == d) {
						continue;
					}
					//이 행을 실행한다는 건 필요한 숫자가 다 만들어졌다는 뜻
					//마지막 조건의 검사가 필요
					
					int no1 = a * 1000 + b * 100 + c * 10 + d;
					int no2 = d * 1000 + c * 100 + b * 10 + a;
					
					if(no1 + no2 == 16456) {
						//모든 조건에 부합
						
						result = no1;
						
						break;		//원하는 숫자를 찾았기 때문에 더이상 탐색할 필요가 없다.
					}
				}
			}
		}
		//출력
		System.out.println("찾는 번호는 " + result + " 입니다.");
	}
}
