<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<%@ page import="com.oreilly.servlet.MultipartRequest,
com.oreilly.servlet.multipart.DefaultFileRenamePolicy,
java.util.*,
java.io.*"%>

<% String savePath="C:/FileUPload/filestorage";
   String encType ="EUC-KR";
   int maxSize=5*1024*1024;//5M 까지 제한
   try{
	   MultipartRequest multi = null;
	   multi = new MultipartRequest(request, savePath, maxSize, encType,new DefaultFileRenamePolicy() );
	   
	   String name = multi.getParameter("name");
	   String subject= multi.getParameter("subject");
	   
	   out.println("작성자:"+name+"<br>");
	   out.println("제목:"+subject+"<br>");
	   out.println("<br>");
	   
	   Enumeration files = multi.getFileNames();
	   
	   while(files.hasMoreElements()){
		   String fname =(String)files.nextElement();
		   String original = multi.getOriginalFileName(fname);
		   String filename= multi.getFilesystemName(fname);
		   String type = multi.getContentType(fname);
		   File f = multi.getFile(fname);
		   
		   out.println("파일 업로드 객체 이름 : " + fname + "<br>");
		   out.println("실제파일이름:" +original + "<br>");
		   out.println("저장된파일이름:"+filename+"<br>");
		   out.println("파일 타입:" + type+ "<br>");
		   
		   if(f !=null){
			   out.println("파일 크기:" + f.length());
		   }
		   
	   }
	   
   }catch(Exception e){
	   System.out.println(e);
   }
%>
