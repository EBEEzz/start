package test.db;

import java.sql.*;

public class GitJDBC {

	public GitJDBC() {
		//이 클래스가 new될 때 드라이버가 로딩되게 처리
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			System.out.println("*** 드라이버 로딩 실패 ***");
		}
	}
	
	//DB작업을 위해 접속이 필요한 경우 커넥션을 만들어서 반환해주는 함수
	public Connection getCon() {
		Connection con = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "githrd";
		String pw = "12345";
		
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {}
		
		return con;
	}
	
	//Statement가 필요하면 준비해서 반환해주는 함수
	public Statement getStmt(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {}
		return stmt;
	}
	
	//PreparedStatement가 필요하면 준비해서 반환해주는 함수
	public PreparedStatement getPstmt(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {}
		return pstmt;
	}
	
	//사용하지 않는 자원 반환해주는 함수
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				//입력된 데이터가 커넥션인지
				((Connection) o).close();
			} else if(o instanceof Statement) {
				((Statement) o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch(Exception e) {}
	}
}
