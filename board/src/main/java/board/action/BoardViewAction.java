package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.dto.SearchDTO;
import board.sevice.BoardViewService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardViewAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// bno 가져오기
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		// 페이지 나누기 후 추가되는 부분
		int page = Integer.parseInt(request.getParameter("page"));
		int amount = Integer.parseInt(request.getParameter("amount"));
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		SearchDTO searchDto = new SearchDTO(criteria, keyword, page, amount);
		
		// service 작업
		BoardViewService service = new BoardViewService();
		BoardDTO dto = service.read(bno);
		
		request.setAttribute("dto", dto);
		request.setAttribute("searchDto", searchDto);
		
		// 페이지 이동
		return new ActionForward(path,false);
	}

}
