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
	public void printAll() {
		MemberVO mvo = mDao.getAll();
		System.out.println();
		System.out.println("*** 사원 정보 ***");
		System.out.printf("회원번호 : %4d\n", mvo.getMno());
	}
	
	// 회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	
	
	// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
	
	
	// [ 선택 ] Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	
	public static void main(String[] args) {
		new MemberController();
	}

}
