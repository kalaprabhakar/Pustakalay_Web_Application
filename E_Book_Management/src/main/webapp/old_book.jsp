<%@page import="com.kuu.beans.UserBO"%>
<%@page import="org.apache.catalina.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.kuu.beans.BookDetails"%>
<%@page import="java.util.List"%>
<%@page import="com.kuu.dao.BookDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="all_component/allcss.jsp"%>
</head>
<body style="background-color: #f7e7e6">
	<%@ include file="all_component/navbar.jsp"%>
	
	<c:if test="${empty userobj }">
		<c:redirect url="login.jsp">
		</c:redirect>

	</c:if>
	<c:if test="${not empty succMsg }">

		<div class="text-center text-success">${succMsg }</div>
			<c:remove var="succMsg" scope="session"></c:remove>

	</c:if>
	<c:if test="${not empty failedMsg }">

		<div class="text-center text--danger" >${failedMsg }</div>
			<c:remove var="failedMsg" scope="session"></c:remove>

	</c:if>

	<div class="container p-5">
		<table class="table table-striped">
			<thead class="bg-primary text-white">
				<tr>
					<th scope="col">Book Name</th>
					<th scope="col">Author</th>
					<th scope="col">Price</th>
					<th scope="col">Category</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>

				<%
				UserBO u = (UserBO) session.getAttribute("userobj");
				
				String  email  = u.getEmail();
				

				BookDAOImpl dao = new BookDAOImpl();

				List<BookDetails> list = new ArrayList<>();

				list = dao.getBookByOld(email,"Old");
				for(BookDetails book : list){
					%>
					
					<tr>
					<th scope="row"><%=book.getBookname() %></th>
					<td><%=book.getAuthor() %></td>
					<td><%=book.getPrice() %></td>
					<td><%=book.getBookCategory() %></td>
					<td><a href="deleteoldbook?email=<%=u.getEmail() %>&&bookid=<%=book.getBookId() %>" class="btn btn-sm btn-danger">Delete</a></td>
				</tr>
					<% 
				}
				%>
				

			</tbody>
		</table>

	</div>

</body>
</html>