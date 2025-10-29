<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
    String error=(String)request.getAttribute("error Message");
    if(error != null){
    	%>
    	<h1 style='color:red'><%=error%></h1>
    <% 
    }
    
    %>
    
    <form action="login">
    <label>Enter email</label>
    <input type="email" name="email"><br><br>
    <label>Enter password</label>
    <input type="password" name="password"><br><br>
    <input type="submit" value="submit">
    </form>
</body>
</html>