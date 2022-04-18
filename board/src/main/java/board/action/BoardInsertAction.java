package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.sevice.BoardInsertService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardInsertAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// getParameter
		// qna_board_write.jsp에서 넘어오는 값 가져오기(BoardDTO))
		BoardDTO insertDto = new BoardDTO();
		insertDto.setTitle(request.getParameter("title"));
		insertDto.setName(request.getParameter("name"));
		insertDto.setContent(request.getParameter("content"));
		insertDto.setPassword(request.getParameter("password"));
		
		
		// service 호출
		BoardInsertService service = new BoardInsertService();
		
		// 성공 qList.do ,입력실패시 경로 qna_board_write.jsp
		if(!service.insert(insertDto)) {
			path = "/view/qna_board_write.jsp"; 
		}
		
		// ActionForward 객체 생성 후 리턴
		
		return new ActionForward(path, true);
	}

}
