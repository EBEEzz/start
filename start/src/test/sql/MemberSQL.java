package test.sql;

public class MemberSQL {
	//코드변수
	public final int SEL_MEMBER_INFO	= 1001;
	
	//질의명령을 기억하고 있다가 요청하면 반환해주는 함수
	public String getSQL(int code) {
		//질의명령으로 된 문자열을 반환
		//StringBuffer 클래스를 이용해서 질의명령을 조립, 문자열로 반환해주기
		
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_MEMBER_INFO:
			buff.append("SELECT ");
			buff.append("	mno, id, name, mail ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			buff.append("	AND mno = ? ");
			break;
		}
		return buff.toString();
	}

}
