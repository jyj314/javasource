package member.service;

import java.sql.Connection;

import static member.dao.JdbcUtil.*;
import member.dao.MemberDAO;

public class MemberCheckIdService {
	public boolean dupId(String userid) {
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		boolean result = dao.checkId(userid);
		
		close(con);
		
		return result;
	}
}
