package item.service;

import java.sql.Connection;

import item.dao.ItemDAO;

import static item.dao.JdbcUtil.*;

public class ItemUpdateSerivce {
	public boolean updateItem(int num,int price,String psize) {
		Connection con = getConnection();
		ItemDAO dao = new ItemDAO(con);
		boolean result = dao.update(num, price,psize);
		
		if (result) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		return result;
	}

}
