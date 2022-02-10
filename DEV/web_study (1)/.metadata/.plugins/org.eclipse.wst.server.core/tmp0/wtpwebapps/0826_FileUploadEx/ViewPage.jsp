<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<%@ page import="com.oreilly.servlet.MultipartRequest,
com.oreilly.servlet.multipart.DefaultFileRenamePolicy,
java.util.*,
java.io.*"%>

<% String savePath="C:/FileUPload/filestorage";
   String encType ="EUC-KR";
   int maxSize=5*1024*1024;//5M ���� ����
   try{
	   MultipartRequest multi = null;
	   multi = new MultipartRequest(request, savePath, maxSize, encType,new DefaultFileRenamePolicy() );
	   
	   String name = multi.getParameter("name");
	   String subject= multi.getParameter("subject");
	   
	   out.println("�ۼ���:"+name+"<br>");
	   out.println("����:"+subject+"<br>");
	   out.println("<br>");
	   
	   Enumeration files = multi.getFileNames();
	   
	   while(files.hasMoreElements()){
		   String fname =(String)files.nextElement();
		   String original = multi.getOriginalFileName(fname);
		   String filename= multi.getFilesystemName(fname);
		   String type = multi.getContentType(fname);
		   File f = multi.getFile(fname);
		   
		   out.println("���� ���ε� ��ü �̸� : " + fname + "<br>");
		   out.println("���������̸�:" +original + "<br>");
		   out.println("����������̸�:"+filename+"<br>");
		   out.println("���� Ÿ��:" + type+ "<br>");
		   
		   if(f !=null){
			   out.println("���� ũ��:" + f.length());
		   }
		   
	   }
	   
   }catch(Exception e){
	   System.out.println(e);
   }
%>
