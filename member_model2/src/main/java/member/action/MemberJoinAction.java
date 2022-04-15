package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import member.dao.MemberDAO;
import member.dto.MemberDTO;
import member.service.MemberJoinService;
import member.service.MemberModifyService;

@AllArgsConstructor
public class MemberJoinAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		MemberDTO registerDto = new MemberDTO();

		registerDto.setUserid(request.getParameter("userid"));
		registerDto.setPassword(request.getParameter("password"));
		registerDto.setName(request.getParameter("name"));
		registerDto.setGender(request.getParameter("gender"));
		registerDto.setEmail(request.getParameter("email"));

		String confirmPassword = request.getParameter("confirm_password");
		
		MemberJoinService service = new MemberJoinService();
		if(confirmPassword.equals(registerDto.getPassword())){
			if(!service.join(registerDto)){
				path = "/view/joinForm.jsp";
			}
		}
		return new ActionForward(path,true);
	}

}
