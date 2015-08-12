<%@page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="com.Sophia.web.hibernate.bean.Cat" %>
<%@page import="java.util.List" %>


<h4>${ msg }</h4>
Cat List
[<a href="catServlet?action=initAdd">Add</a>][<a href="catServlet?action=list">List cat</a>]
<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Description</th>
		<th>Mother</th>
		<th>Operation</th>
	</tr>
	<%
		@SuppressWarnings("unchecked")
		List<Cat> catList=(List<Cat>) request.getAttribute("catList");
	
		for(Cat cat:catList ){
			out.write("<tr>");
			out.write("<td>"+ cat.getId()+"</td>");
			out.write("<td>"+ cat.getName()+"</td>");
			out.write("<td>"+ cat.getDescription()+"</td>");
			String motherString="";
			Cat mother=cat.getMother();
			while(mother != null){
				if(motherString.trim().length()==0){
					motherString = mother.getName();
				}else{
					motherString=mother.getName() + " / "+ motherString;
				}
				mother=mother.getMother();
			}
			out.write("<td>"+ motherString+"</td>");
			out.write("<td>");
			out.write(" <a href=catServlet?action=delete&id=" +cat.getId() + " onclick=\"return confirm('Are you sure that you want to delete?'); \">delete</a>");
			out.write(" <a href=catServlet?action=edit&id=" +cat.getId() + ">edit</a>");
			out.write("</td>");
			out.write("</tr>");
			
		}
	%>
</table>