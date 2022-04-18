package board.sevice;

import java.sql.Connection;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

import static board.dao.JdbcUtil.*;

public class BoardInsertService {
	public boolean insert(BoardDTO insertDto) {
		
		//db작업
		Connection con = getConnection();
		BoardDAO dao = new BoardDAO(con);
		boolean flag = dao.insertArticle(insertDto);
		
		if(flag) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		
		return flag;
	}
}
