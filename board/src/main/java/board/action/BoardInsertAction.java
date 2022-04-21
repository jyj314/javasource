package board.action;

import java.net.URLEncoder;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.sevice.BoardInsertService;
import board.util.UploadUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardInsertAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UploadUtil util = new UploadUtil();
		HashMap<String, String> dataMap = util.uploadFile(request);
		
		// dataMap에서 값 가져오기
		BoardDTO insertDto = new BoardDTO();
		insertDto.setName(dataMap.get("name"));
		insertDto.setTitle(dataMap.get("title"));
		insertDto.setContent(dataMap.get("content"));
		insertDto.setPassword(dataMap.get("password"));
		insertDto.setAttach(dataMap.get("attach"));
		
//		// getParameter
//		// qna_board_write.jsp에서 넘어오는 값 가져오기(BoardDTO))
//		BoardDTO insertDto = new BoardDTO();
//		insertDto.setTitle(request.getParameter("title"));
//		insertDto.setName(request.getParameter("name"));
//		insertDto.setContent(request.getParameter("content"));
//		insertDto.setPassword(request.getParameter("password"));
		
		// 페이지 나누기 후 추가되는 부분
		String page = dataMap.get("page");
		String amount = dataMap.get("amount");
		String criteria = dataMap.get("criteria");
		String keyword = URLEncoder.encode(dataMap.get("keyword"),"utf-8");
		
		// service 호출
		BoardInsertService service = new BoardInsertService();
		
		// 성공 qList.do ,입력실패시 경로 qna_board_write.jsp
		if(!service.insert(insertDto)) {
			path = "/view/qna_board_write.jsp?page="+page+"&amount="+amount+"&criteria="+criteria+"&keyword="+keyword;  
		}else {
			path += "?&page="+page+"&amount="+amount+"&criteria="+criteria+"&keyword="+keyword; 
		}
		
		// ActionForward 객체 생성 후 리턴
		
		return new ActionForward(path, true);
	}

}
