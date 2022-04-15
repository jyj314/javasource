package item.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import item.dto.ItemDTO;
import item.service.ItemInsertService;

public class ItemInsertAction implements Action {
	
	private String path;
	
	public ItemInsertAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// getParameter
		// insert.jsp에서 넘어오는 값 가져오기(BookDTO))
		ItemDTO dto = new ItemDTO();
		dto.setCategory(request.getParameter("category"));
		dto.setName(request.getParameter("name"));
		dto.setContent(request.getParameter("content"));
		dto.setPsize(request.getParameter("psize"));
		dto.setPrice(Integer.parseInt(request.getParameter("price")));
		
		
		// service 호출
		ItemInsertService service = new ItemInsertService();
		if(!service.insertItem(dto)) {
			path = "/insert.jsp"; //입력실패시 경로
		}
		
		// ActionForward 객체 생성 후 리턴
		
		return new ActionForward(path, true);
	}

}
