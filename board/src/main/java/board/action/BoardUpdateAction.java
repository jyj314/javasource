package board.action;

import java.net.URLEncoder;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDTO;
import board.dto.SearchDTO;
import board.sevice.BoardUpdateService;
import board.util.UploadUtil;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class BoardUpdateAction implements Action {

	private String path; // /qView.do
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UploadUtil util = new UploadUtil();
		HashMap<String, String>dataMap = util.uploadFile(request);
		
		//dataMAp 에서 값 가져오기
		BoardDTO updateDto = new BoardDTO();
		updateDto.setBno(Integer.parseInt(dataMap.get("bno")));
		updateDto.setTitle(dataMap.get("title"));
		updateDto.setContent(dataMap.get("content"));
		updateDto.setPassword(dataMap.get("password"));
		updateDto.setAttach(dataMap.get("attach")); //파일첨부를 했다면 값이 들어와있고, 안했다면 null
		
		//페이지 나누기 후 추가
		String page = dataMap.get("page");
		String amount = dataMap.get("amount");
		String criteria = dataMap.get("criteria");
		String keyword = URLEncoder.encode(dataMap.get("keyword"),"utf-8");
		
		//서비스 호출
		BoardUpdateService service = new BoardUpdateService();
		
		//결과에 따라 페이지 이동 => 성공 qView.do 실패 qModify.do
		if (!service.update(updateDto)) {
			path = "qModify.do?bno="+updateDto.getBno()+"&page="+page+"&amount="+amount+"&criteria="+criteria+"&keyword="+keyword;
		}else {
			path += "?bno="+updateDto.getBno()+"&page="+page+"&amount="+amount+"&criteria="+criteria+"&keyword="+keyword; 
		}
		
		return new ActionForward(path,true);
	}

}
