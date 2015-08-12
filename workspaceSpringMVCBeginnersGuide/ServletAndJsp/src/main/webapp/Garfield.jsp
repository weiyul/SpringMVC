<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
<font color = "blue" size="5pt">
	Oh Yeah! I am Garfield! Good luck!
</font>
<jsp:forward page="Snoopy.jsp">
	<jsp:param name="Reason" value="Garfield called me and let me out!"/>
</jsp:forward>

</body>
</html>