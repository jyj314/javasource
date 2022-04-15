package member.service;

import static member.dao.JdbcUtil.close;
import static member.dao.JdbcUtil.commit;
import static member.dao.JdbcUtil.getConnection;
import static member.dao.JdbcUtil.rollback;

import java.sql.Connection;

import static member.dao.JdbcUtil.*;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberJoinService {
	   public boolean join(MemberDTO registerDto) {
	   
		   Connection con = getConnection();
		   MemberDAO dao = new MemberDAO(con);
		   
	
	   boolean result = dao.register(registerDto);
	   
	   if(result) {
	      commit(con);   
	   } else {
	      rollback(con);
	   }
	   close(con);
	   return result;
	   }  

}
