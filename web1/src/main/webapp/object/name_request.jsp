<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
    form method = 'get' => 한글 처리 가능
    method = 'post' => 직접 인코딩 처리
	jsp 내장 객체
	1) HttpServletRequest request : 사용자의 요청을 가져올 수 있음
    2) HttpServletResponse : 사용자에게 응답할 때 사용
    
--%>
     <%
     // request.getParameter() : 품안에 들어있는 정보들 가져오기
     // ?num=1&age=10 : get 넘어오는 정보들 가져오기
     
     
     request.setCharacterEncoding("utf-8");
     String name = request.getParameter("username");
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=name %></h3>
</body>
</html>