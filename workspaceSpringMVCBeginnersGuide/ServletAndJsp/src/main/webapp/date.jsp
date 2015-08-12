<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>Hello World!</h2>
<p><%=new java.util.Date() %></p>
<p>Start to count:</p>
<p>
<%
System.out.println("calling name");
String name = "Garfield";
for(int a=0; a<5; a++){
	System.out.println("Hello!"+ name+", have a nice day!");
}
%>
</p>
</body>
</html>
