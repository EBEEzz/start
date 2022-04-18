package githrd.sql;

public class MemberSQL {
	//코드변수
	public final int SEL_ALL		= 1001;
	
	//질의명령을 기억하고 있다가 요청하면 반환해주는 함수
	public String getSQL(int code) {
		//반환값을 만들 변수
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("	* ");
			buff.append("FROM ");
			buff.append("	member ");
			break;
		}
		
		return buff.toString();
	}
}
