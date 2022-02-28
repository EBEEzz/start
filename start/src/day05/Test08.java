package day05;
/*
 	1부터 6까지 기억하는 배열의 데이터를 꺼내서 출력하세요.
 	
 	참고) 배열 : 타입이 같은 데이터를 일정개수만큼 모아서 하나로
 	관리하도록 만들어놓은 자바의 데이터 타입
 	
 		데이터의 타입과 갯수가 결정되어야 만들 수 있다.
 		
 		단점 - 한번 사이즈(갯수)가 결정이 되면 수정이 안된다.
 		
 	형식) 데이터타입[] 변수이름 = new 데이터타입[데이터갯수];
 			or
 		  데이터타입[] 변수이름 = {데이터1, 데이터2, 데이터3, ... };
 		  
 		  데이터타입 변수이름 = 배열변수[위치값];	//해당 위치의 배열 데이터 값을 새 변수에 기억
 		  위치는 0부터 시작.
 */
public class Test08 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5, 6};
		
		//갯수 알아내기
		int len = num.length;
		
		for(int i = 0; i < len; i++) {
			System.out.println(((i + 1) + "번째 데이터 : " + num[i] ));
		}
		
		//향상된 for 명령으로 처리
		for(int no : num) {
			System.out.println("### " + no);
		}
	}

}
