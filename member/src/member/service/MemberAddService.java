package member.service;

import java.sql.Connection;

import member.dao.JdbcUtil;
import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberAddService {
	
	public boolean insertMember(MemberDTO insertDTO) {
		boolean isAddSuccess = false;
		
		//비지니스 로직 처리 => 테이블에 member 추가
		Connection con = JdbcUtil.getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		if(dao.insert(insertDTO)) {
			isAddSuccess = true;
			JdbcUtil.commit(con);
		}else {
			JdbcUtil.rollback(con);
		}
		
		JdbcUtil.close(con);
		
		//비지니스 로직 결과 리턴
		return isAddSuccess;
	}
}
