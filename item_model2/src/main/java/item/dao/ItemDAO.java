package item.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static item.dao.JdbcUtil.*;

import item.dto.ItemDTO;

public class ItemDAO {
	private Connection con;

	public ItemDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//CRUD
	public boolean insert(ItemDTO dto) {
		boolean flag = false;
		PreparedStatement pstmt=null;
		String sql = "insert into item(num,category,name,content,psize,price) values(item_seq.nextval,?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getCategory());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getPsize());
			pstmt.setInt(5, dto.getPrice());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		return flag;
	}
	
	//전체 조회
	   public List<ItemDTO> getList() {
		      List<ItemDTO> list = new ArrayList<>();
		      PreparedStatement pstmt = null;
		      ResultSet rs = null;
		      String sql = "select num,category,name,psize,price,register_at from item";
		      try {
		    	  pstmt = con.prepareStatement(sql);
		    	  rs=pstmt.executeQuery();
		    	  
		    	  while(rs.next()) {
		    		  ItemDTO itemDto = new ItemDTO();
		    		  itemDto.setNum(rs.getInt("num"));
		    		  itemDto.setCategory(rs.getString("category"));
		    		  itemDto.setName(rs.getString("name"));
		    		  itemDto.setPsize(rs.getString("psize"));
		    		  itemDto.setPrice(rs.getInt("price"));
		    		  itemDto.setRegisterAt(rs.getDate("register_at"));
		    		  
		    		  list.add(itemDto);
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
