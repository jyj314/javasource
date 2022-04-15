package book.service;

import java.sql.Connection;
import java.util.List;

import book.dao.BookDAO;
import book.dto.BookDTO;

import static book.dao.JdbcUtil.*;

public class BookSearchService {
   public List<BookDTO> list(String criteria, String Keyword) {
      Connection con = getConnection();
      BookDAO dao = new BookDAO(con);
      List<BookDTO> list = dao.searchList(criteria, Keyword);
      
      close(con);
      
      return list;
   }
}