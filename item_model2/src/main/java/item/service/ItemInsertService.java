package item.service;

import java.sql.Connection;

import item.dao.ItemDAO;
import item.dto.ItemDTO;

import static item.dao.JdbcUtil.*;


public class ItemInsertService {
	public boolean insertItem(ItemDTO insertDto) {
		
		//db작업
		Connection con = getConnection();
		ItemDAO dao = new ItemDAO(con);
		boolean flag = dao.insert(insertDto);
		
		if(flag) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		
		return flag;
	}
}
