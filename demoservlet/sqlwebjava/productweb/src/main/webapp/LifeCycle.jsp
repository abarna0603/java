<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%!public void jspInit(){ 
	  System.out.println("hi this init method");
  } %>
  <%!public void jspDestroy(){
	  System.out.println("hi this Destroy method");
	  
  } %>
  <% System.out.println("hi this Service method");
  %>
  <h1>helloworld</h1>
</body>
</html>