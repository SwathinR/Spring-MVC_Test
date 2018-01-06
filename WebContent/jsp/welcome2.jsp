<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Test</title>
<style type="text/css">
body {
	background-image: url('https://crunchify.com/bg.png');
}
</style>
</head>
<body>${message}
 
	 <jsp:useBean id="counter" scope="session" class="main.java.com.project.controller.WordLength"/>

    <% 
      String w1= request.getParameter("p1"); 
      int l1 = 0;
      counter.setWord(w1);
      l1 = counter.getLength();
    %>

    <p> The word '<%= w1 %>' has <%= l1 %> characters.</p>
    
	 <a href="/welcome/jsp/welcome.jsp">back</a>
</body>
</html>