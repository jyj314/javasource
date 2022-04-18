package item.service;

import java.sql.Connection;
import java.util.List;

import item.dao.ItemDAO;
import item.dto.ItemDTO;

import static item.dao.JdbcUtil.*;

public class ItemSearchService {
	   public List<ItemDTO> list(String category, String name) {
		      Connection con = getConnection();
		      ItemDAO dao = new ItemDAO(con);
		      List<ItemDTO> list = dao.searchList(category, name);
		      
		      close(con);
		      
		      return list;
	   }
}
