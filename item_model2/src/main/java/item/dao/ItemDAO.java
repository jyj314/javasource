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
	   
	 //번호 일치하면 삭제
	   public boolean delete(int num) {
		   boolean flag=false;
		   PreparedStatement pstmt = null;
		   String sql = "delete from item where num=?";
		   
		   try {
			   		pstmt = con.prepareStatement(sql);
			   		pstmt.setInt(1, num);
			   		
			   		int result = pstmt.executeUpdate();
			   		if(result>0) flag = true;
			   		
			} catch (Exception e) {
					e.printStackTrace();
			} finally {
					close(pstmt);
			}
		    return flag;
	   }
	   
	//수정 : Update => 숫자(1- 성공, 0-실패)
	   public boolean update(int num, int price ,String psize) {
		   boolean result = false;
		   PreparedStatement pstmt = null;
		   String sql = "update item set price =?, psize=? where num=?";
		   try {
			   pstmt = con.prepareStatement(sql);
			   pstmt.setInt(1, price);
			   pstmt.setString(2, psize);
			   pstmt.setInt(3, num);
			   
			   int cnt = pstmt.executeUpdate();
			   
			   if(cnt>0) result = true;
		   } catch (Exception e) {
			   e.printStackTrace();
		   } finally {
			   close(pstmt);
		   }
		   	return result;
	   }
	   

	 //검색 : 
	   public List<ItemDTO> searchList(String category, String name) {
		      List<ItemDTO> list = new ArrayList<>();
		      PreparedStatement pstmt = null;
		      ResultSet rs = null;
		      String sql = "select num,category,name,psize,price,register_at from item where category=? and name=?";

		    try {
		    		pstmt = con.prepareStatement(sql);
		    		pstmt.setString(1, category);
		    		pstmt.setString(2,name);
		    		rs = pstmt.executeQuery();
		    		
		    	while(rs.next()) {
		    		  ItemDTO dto = new ItemDTO();
		    		  dto.setNum(rs.getInt("num"));
		    		  dto.setCategory(rs.getString("category"));
		    		  dto.setName(rs.getString("name"));
		    		  dto.setPsize(rs.getString("psize"));
		    		  dto.setPrice(rs.getInt("price"));
		    		  dto.setRegisterAt(rs.getDate("register_At"));
		    		  
		    		  list.add(dto);
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
