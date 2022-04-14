<%@page import="book.dao.BookDAO"%>
<%@page import="book.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	//update.jsp 넘김 값 가녀오기
	int code = Integer.parseInt(request.getParameter("code"));
	int price = Integer.parseInt(request.getParameter("price"));
	
	//db작업
	Connection con = JdbcUtil.getConnection();
	BookDAO dao = new BookDAO(con);
	boolean result = dao.update(code,price);
	
	//페이지 이동
	String path = "";
	if(result){
		JdbcUtil.commit(con);
		path = "listPro.jsp";
	}else{
		JdbcUtil.rollback(con);
		path="update.jsp";
	}
	JdbcUtil.close(con);
	
	response.sendRedirect(path);
%>