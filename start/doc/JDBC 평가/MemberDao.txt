package test.dao;

import java.sql.*;

import test.db.*;
import test.sql.*;
import test.vo.*;

public class MemberDao {
	private GitJDBC db;
	private Connection con;
//	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private MemberSQL mSQL;

	public MemberDao() {
		db = new GitJDBC();
		//오라클 드라이버가 로딩됨
		
		//질의명령 사용 준비
		mSQL = new MemberSQL();
	}
	
	public MemberVO getInfo(int mno) {
		//반환값 변수
		MemberVO mVO = new MemberVO();
		//커넥션 꺼내오기
		con = db.getCon();
		//질의명령 가져오기
		String sql = mSQL.getSQL(mSQL.SEL_MEMBER_INFO);
		//명령전달도구 준비
		pstmt = db.getPstmt(con, sql);
		try {
			//질의명령 완성
			pstmt.setInt(1, mno);
			//질의명령 보내고 결과받기
			rs = pstmt.executeQuery();
			//가상레코드포인터 한줄 내리기
			rs.next();
			
			//데이터 꺼내서 채우기
			String name = rs.getString("name");
			String id = rs.getString("id");
			String mail = rs.getString("mail");
			
			mVO.setName(name);
			mVO.setId(id);
			mVO.setMail(mail);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		//데이터 반환
		return mVO;
	}
}
