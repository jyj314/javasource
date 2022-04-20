package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static board.dao.JdbcUtil.*;

import board.dto.BoardDTO;
import board.dto.SearchDTO;

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
		public List<BoardDTO> listArticle(SearchDTO searchDto){
	      List<BoardDTO> list = new ArrayList<>();
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      //String sql = "select bno,title,name,regdate,readcount,re_ref,re_seq,re_lev from board order by re_ref desc, re_seq asc";
	      
	      String sql = " select * from(select rownum as rnum, A.* ";
	    		sql+=" from (select bno, title, name, regdate, readcount, re_ref, re_lev, re_seq ";
	    		sql+=" from board ";
	    		sql+=" where bno > 0 order by re_ref desc, re_seq asc) A ";
	    		sql+="	where rownum <= ?) ";
				sql+="	where rnum > ? ";
	      
	      int start = searchDto.getPage() * searchDto.getAmount();
	      int end = (searchDto.getPage()-1) * searchDto.getAmount();
	      
	      try {
	    	  pstmt = con.prepareStatement(sql);
	    	  
	    	  pstmt.setInt(1, start);
	    	  pstmt.setInt(2, end);
	    	  
	    	  rs=pstmt.executeQuery();
	    	  while(rs.next()) {
	    		  BoardDTO listDto = new BoardDTO();
	    		  listDto.setBno(rs.getInt("bno"));
	    		  listDto.setTitle(rs.getString("title"));
	    		  listDto.setName(rs.getString("name"));
	    		  listDto.setRegDate(rs.getDate("regdate"));
	    		  listDto.setReadCount(rs.getInt("readcount"));
	    		  listDto.setRe_ref(rs.getInt("re_ref"));
	    		  listDto.setRe_seq(rs.getInt("re_seq"));
	    		  //lst.jsp 에서 사용하는 컬럼 : re_lev
	    		  listDto.setRe_lev(rs.getInt("re_lev"));
	    		  
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
	// 전체 게시물 개수
		public int totalRows() {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select count(*) from board";
			int total = 0;
			try {
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					total = rs.getInt(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(rs);
				close(pstmt);
			}
			return  total;
		}
		
		
	//게시판 읽기
		public BoardDTO getROW(int bno) {
			BoardDTO dto = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select bno,name,title,content,attach,re_ref,re_seq,re_lev from board where bno=?";
			
			try {
				
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, bno);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					dto = new BoardDTO();
					dto.setBno(rs.getInt("bno"));
					dto.setName(rs.getString("name"));
					dto.setTitle(rs.getString("title"));
					dto.setContent(rs.getString("content"));
					dto.setAttach(rs.getString("attach"));
					//댓글작업시 필요한 부분
	    		    dto.setRe_ref(rs.getInt("re_ref"));
	    		    dto.setRe_seq(rs.getInt("re_seq"));
	    		    dto.setRe_lev(rs.getInt("re_lev"));
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(rs);
				close(pstmt);
			}
			return dto;
		}
		
	// 조회수 업데이트
		public boolean hitUpdate(int bno) {
			   boolean flag = false;
			   PreparedStatement pstmt = null;
			   String sql = "update board set readcount = readcount+1 where bno = ?";
			   try {
				   pstmt = con.prepareStatement(sql);
				   pstmt.setInt(1, bno);
				   int result = pstmt.executeUpdate();
				   
				   if(result>0) flag = true;
			   } catch (Exception e) {
				   e.printStackTrace();
			   } finally {
				   close(pstmt);
			   }
			   	return flag;
		   }
	
	// 게시물 삭제
		public boolean deleteArticle(int bno, String password) {;
			   boolean flag = false;
			   PreparedStatement pstmt = null;
			   String sql = "delete from board where bno =? and password =?";
			   try {
				   pstmt = con.prepareStatement(sql);
				   pstmt.setInt(1, bno);
				   pstmt.setString(2, password);
				   
				   int result = pstmt.executeUpdate();
				   
				   if(result>0) flag = true;
			   } catch (Exception e) {
				   e.printStackTrace();
			   } finally {
				   close(pstmt);
			   }
			   	return flag;
		   }
		
	// 게시물 수정
		public boolean updateArticle(BoardDTO updateDto) {
			boolean result = false;
			PreparedStatement pstmt = null;
			String sql = "";
				try {
					if(updateDto.getAttach()!=null) {
						sql = "update board set title=?,content=?, attach=? where bno=? and password=? ";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, updateDto.getTitle());
						pstmt.setString(2, updateDto.getContent());
						pstmt.setString(3, updateDto.getAttach());
						pstmt.setInt(4, updateDto.getBno());
						pstmt.setString(5, updateDto.getPassword());
					}else {
						sql = "update board set title=?,content=? where bno=? and password=? ";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, updateDto.getTitle());
						pstmt.setString(2, updateDto.getContent());
						pstmt.setInt(3, updateDto.getBno());
						pstmt.setString(4, updateDto.getPassword());
					}
					
					int flag = pstmt.executeUpdate();
					
					if(flag>0) result = true;
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					close(pstmt);
				}
				return result;
			}
		
	//댓글
		public boolean reply(BoardDTO replyDto) {
			boolean flag = false;
			
			PreparedStatement pstmt = null;
			String sql="";
			
			try {
				
				int re_ref = replyDto.getRe_ref();
				int re_seq = replyDto.getRe_seq();
				int re_lev = replyDto.getRe_lev();
				
				//기존 댓글에 대한 업데이트
						
				sql ="update board set re_seq = re_seq + 1 where re_ref = ? and re_seq > ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, re_ref);
				pstmt.setInt(2, re_seq);
				
				int updateCnt = pstmt.executeUpdate();
				
				close(pstmt);
				
				//	새로운 댓글 삽입
				//	댓글작성(re_ref : 원본글의 re_ref값과 동일하게 삽입,
				//	re_lev : 원본글의 re_lev +1 삽입
				//	re_seq : 원본글의 re_seq +1 삽입)
				
				re_lev = re_lev +1;
				re_seq = re_seq +1;
				
				sql = "insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq)";
				sql+= "values(board_seq.nextval,?,?,?,?,?,?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, replyDto.getName());
				pstmt.setString(2, replyDto.getPassword());
				pstmt.setString(3, replyDto.getTitle());
				pstmt.setString(4, replyDto.getContent());
				pstmt.setString(5, replyDto.getAttach());
				pstmt.setInt(6, re_ref);
				pstmt.setInt(7, re_lev);
				pstmt.setInt(8, re_seq);
				
				int insertCnt = pstmt.executeUpdate();
				
				if(insertCnt>0) {
					flag = true;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(pstmt);				
			}
			
			return flag;
		}
		
	// 검색
	// criteria=title&keyword= 게시판 or
	// criteria=content&keyword= 게시판 or
	// criteria=name&keyword= 게시판
		public List<BoardDTO> searchList(SearchDTO searchDto) {
		      List<BoardDTO> list = new ArrayList<>();
		      PreparedStatement pstmt = null;
		      ResultSet rs = null;
		      try {
		      String sql = "select bno,title,name,regdate,readcount,re_ref,re_seq,re_lev ";
		      		 sql+= "from board where " +searchDto.getCriteria()+ " like ? order by re_ref desc, re_seq asc";
		      		 
		      		 pstmt = con.prepareStatement(sql);
		      		 pstmt.setString(1, "%"+searchDto.getKeyword()+"%");

		    	rs = pstmt.executeQuery();
		    	while(rs.next()) {
		    		  BoardDTO listDto = new BoardDTO();
		    		  listDto.setBno(rs.getInt("bno"));
		    		  listDto.setTitle(rs.getString("title"));
		    		  listDto.setName(rs.getString("name"));
		    		  listDto.setRegDate(rs.getDate("regdate"));
		    		  listDto.setReadCount(rs.getInt("readcount"));
		    		  listDto.setRe_ref(rs.getInt("re_ref"));
		    		  listDto.setRe_seq(rs.getInt("re_seq"));
		    		  //lst.jsp 에서 사용하는 컬럼 : re_lev
		    		  listDto.setRe_lev(rs.getInt("re_lev"));
		    		  
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




