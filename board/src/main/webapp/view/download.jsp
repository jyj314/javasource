<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// download
	
	// 사용자가 다운로드를 요청한 파일명 가져오기
	String fileName = request.getParameter("fileName");


	// 서버 폴더에 가서 해당 파일 읽어오기
	FileInputStream fis = new FileInputStream("E://coding//upload//"+fileName);
	BufferedInputStream bis = new BufferedInputStream(fis);
	
	// 브라우저에 파일 붙여서 보내기
	response.setContentType("application/octet-stream"); //MIME
	
	// Content-Disposition : inline => 웹 페이지 안에서 보여주기
	// Content-Disposition : attatchment => 반드시 다운로드
	// Content-Disposition : attatchment; filename=1.jpg=> filename 이름값을 이용해 다운로드
	
	// 파일 작성.txt => 공백에 파일명에 있으면 인코딩 시킬 때 + 변경이 일어남(공백 상태로 처리)

	fileName = URLEncoder.encode(fileName,"utf-8").replaceAll("\\+", "%20");
	
	//java.lang.IllegalStateException:이 응답을 위해getOUtputStream()이 이미 호출되었습니다.
	out.clear();
	out= pageContext.pushBody();
	
	// f87d2f12-af83-408c-9616-14b9688636a9_파일 저장
	
	fileName = fileName.substring(fileName.indexOf("_")+1);
	
	response.setHeader("Content-Disposition", "attachment;filename="+fileName);
	BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
	
	int numRead =0;
	byte[] b = new byte[4096];
	while((numRead = bis.read(b,0,b.length))!=-1){
		bos.write(b,0,numRead);
	}
	bos.flush();
	bos.close();
	bis.close();

%>