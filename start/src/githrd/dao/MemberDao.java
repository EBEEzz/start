package githrd.dao;

import java.sql.*;
import java.util.*;
import java.util.Date;

import githrd.db.*;
import githrd.sql.*;
import githrd.vo.*;

public class MemberDao {
	private JenyJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private MemberSQL mSQL;

	public MemberDao() {
		//드라이버 로딩
		db = new JenyJDBC();
		//질의명령 준비
		mSQL = new MemberSQL();

		/*
		//테스트용
		con = db.getCon();
		System.out.println("####### 커넥션 꺼내오기 성공 #######");
		db.close(con);
		*/
	}
	
	//모든 사원의 정보를 조회해서 반환해주는 함수
	public MemberVO getAll() {
		//반환값 변수
		MemberVO mVO = new MemberVO();
		//커넥션
		con = db.getCon();
		//질의명령 가져오기
		String sql = mSQL.getSQL(mSQL.SEL_ALL);
		//명령전달도구 준비
		stmt = db.getStmt(con);
		
		try {
			//질의명령 보내고 결과 받기
			rs = stmt.executeQuery(sql);
			//가상레코드포인터 한줄 내리고
			rs.next();
			//데이터 꺼내서 VO에 담고
			int mno = rs.getInt("mno");
			int avt = rs.getInt("avt");
			String name = rs.getString("name");
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String mail = rs.getString("mail");
			String tel = rs.getString("tel");
			String gen = rs.getString("gen");
			String show = rs.getString("isshow");
			Date jdate = rs.getDate("joindate");
			Time jtime = rs.getTime("joindate");
			
			mVO.setMno(mno);
			mVO.setAvt(avt);
			mVO.setName(name);
			mVO.setId(id);
			mVO.setPw(pw);
			mVO.setMail(mail);
			mVO.setTel(tel);
			mVO.setGen(gen);
			mVO.setShow(show);
			mVO.setJdate(jdate);
			mVO.setJtime(jtime);
			mVO.setSdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		return mVO;
	}

}
