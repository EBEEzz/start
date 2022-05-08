package test.controller;

import java.util.*;

import test.dao.*;
import test.vo.*;

public class MemberInfo {
	private MemberDao mDao;

	public MemberInfo() {
		mDao = new MemberDao();
		
		Scanner sc = new Scanner(System.in);
		
		int mno = 0;
		
		System.out.print("회원번호를 입력하세요!\n입력 : ");
		try {
			mno = sc.nextInt();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		MemberVO mvo = mDao.getInfo(mno);
		
		System.out.println("*** " + mno + "번 회원 정보조회");
		System.out.println("============================================================================");
		System.out.println("|    아 이 디    |     회  원  이  름     |         이    메    일         |");
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf("|%15s | %20s | %30s |\n", mvo.getId(), mvo.getName(), mvo.getMail());
		System.out.println("============================================================================");
		System.out.println();
	}

	public static void main(String[] args) {
		new MemberInfo();
	}

}
