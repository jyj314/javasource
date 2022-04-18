package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static board.dao.JdbcUtil.*;

import board.dto.BoardDTO;

public class BoardDAO {
	private Connection con;

	public BoardDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//CRUD
	//게시글 삽입,삭제,수정(게시글 수정,조회수 수정),조회,전체조회,
	
	public boolean insertArticle(BoardDTO insertDto) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq)"
				+"values(board_seq.nextval,?,?,?,?,?,board_seq.currval,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, insertDto.getName());
			pstmt.setString(2, insertDto.getPassword());
			pstmt.setString(3, insertDto.getTitle());
			pstmt.setString(4, insertDto.getContent());
			pstmt.setString(5, insertDto.getAttach());
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return flag;
		
	}
	//전체조회
		public List<BoardDTO> listArticle(){
	      List<BoardDTO> list = new ArrayList<>();
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String sql = "select bno,title,name,regdate,readcount from board order by bno desc";
	      try {
	    	  pstmt = con.prepareStatement(sql);
	    	  rs=pstmt.executeQuery();
	    	  
	    	  while(rs.next()) {
	    		  BoardDTO listDto = new BoardDTO();
	    		  listDto.setBno(rs.getInt("bno"));
	    		  listDto.setTitle(rs.getString("title"));
	    		  listDto.setName(rs.getString("name"));
	    		  listDto.setRegDate(rs.getDate("regdate"));
	    		  listDto.setReadCount(rs.getInt("readcount"));
	    		  
	    		  list.add(listDto);
	    	  }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
	      return list;
	   }
}
