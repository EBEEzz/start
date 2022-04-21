package githrd.controller;

import java.util.*;

import githrd.dao.*;
import githrd.vo.*;

public class MemberController {
	private MemberDao mDao;
	
	public MemberController() {
		mDao = new MemberDao();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//메세지 출력
			System.out.print("회원번호로 조회 : mno\n아이디로 조회 : id\n 명령 입력 : ");
			String str = sc.nextLine();
			System.out.println();
			
			switch(str) {
			case "mno":
				
			}
		}
		
	}
	
	// 회원번호와 아이디를 조회해서 출력해주는 함수
	
	
	// 회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	public void mnoInfoPrint() {
		MemberVO mvo = mDao.getAll();
		System.out.println();
		System.out.println("*** 회원 정보 ***");
		System.out.printf("회원번호 : %4d\n", mvo.getMno());
	}
	
	// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
	
	
	// [ 선택 ] Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	
	
	/*
	 	문제)
	 		회원리스트를 꺼내오는데 한페이지당 3명의 아이디, 메일, 가입일을
	 		리스트 형식으로 보여주고 그 중에서 한명의 아이디를 입력하면
	 		그 회원의 상세데이터를 보여주는 기능을 구현하세요.
	 		
	 		한페이지당 보여주는 리스트의 갯수는 3개로 하고
	 		한페이지당 보여지는 페이지 수는 3개로 한다.
	 		이전, 다음 페이지를 같이 표현해서 이동가능한 페이지 메뉴는 총 5개로 한다.
	 		이전 페이지를 누르면 현재 보는 페이지가 5페이지라면 3페이지로 이동하고
	 		이동가능한 페이지는 1 ~ 3으로 변경되어야 한다.
	 		현재 보는 페이지가 1페이지인데 다음을 선택하면 4페이지로 이동하고
	 		시작페이지는 4페이지가 되고 종료페이지는 6페이지가 되어야 한다.
	 */
	
	public static void main(String[] args) {
		new MemberController();
	}

}
