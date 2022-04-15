package member.action;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.AllArgsConstructor;
import member.dao.JdbcUtil;
import member.dao.MemberDAO;
import member.service.MemberLeaveService;

@AllArgsConstructor
public class MemberLeaveAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("current_password");
		
		MemberLeaveService service = new MemberLeaveService();
		if(!service.remove(userid, password)) {
			path = "/view/leaveForm.jsp";
		}else {
			HttpSession session =request.getSession();
			session.invalidate();
		}
		
		//db작업(leave)
//		Connection con = JdbcUtil.getConnection();
//		MemberDAO dao = new MemberDAO(con);
//		boolean result = dao.leave(userid,password);
//		
//		HttpSession session =request.getSession();
//		//탈퇴성공 - 세션해제
//		//페이지 이동- 성공:index,실패:leaveForm
//			if(result){
//				JdbcUtil.commit(con);
//				session.invalidate();
//				path = "/index.jsp";
//			}else{
//				JdbcUtil.rollback(con);
//				path = "/view/leaveForm.jsp";
//			}
//			JdbcUtil.close(con);	
		
		return new ActionForward(path,true);
	}

}
