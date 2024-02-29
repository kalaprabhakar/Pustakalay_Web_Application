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
<title>Admin: All Books</title>
<%@ include file="allcss.jsp"%>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	
	<c:if test="${empty userobj }">
	<c:redirect url="../login.jsp">
	</c:redirect>
	</c:if>
	
	<c:if test="${not empty succMsg }">
							<p class="text-center text-success">${succMsg }</p>
							<c:remove var="succMsg" scope="session" />
						</c:if>
						<c:if test="${not empty failedMsg }">
							<h5 class="text-center text-danger">${failedMsg }</h5>
							<c:remove var="failedMsg" scope="session" />
						</c:if>
	
	<h3 class="texr-center">Hello Admin</h3>

	<table class="table table-striped">
	<thead class="bg-primary text-white">
		<tr>
		    <th scope="col">ID</th>
			<th scope="col">Image</th>
			<th scope="col">Book Name</th>
			<th scope="col">Author</th>
			<th scope="col">Price</th>
			<th scope="col">Categories</th>
			<th scope="col">Status</th>
			<th scope="col">Action</th>
		</tr>
		</thead>
		<tbody>
		<%
		
		BookDAOImpl dao = new BookDAOImpl();
		List<BookDetails> list = dao.getAllBooks();
		for(BookDetails lists : list){
			%>
			<tr>
				<td ><%= lists.getBookId()%></td>
				<td><img src="../books/<%=lists.getPhotoName()%>"  style="width : 50px; height : 50px;"></td>
				<td><%= lists.getBookname() %></td>
				<td><%= lists.getAuthor() %></td>
				<td><%= lists.getPrice() %></td>
				<td><%= lists.getBookCategory() %></td>
				<td><%= lists.getStatus() %></td>
				
				<td>
				<a href="edit_books.jsp?id=<%= lists.getBookId() %>" class="btn btn-sm btn-primary"><i class="fa-solid fa-pen-to-square"></i>Edit</a>
				<a href="../delete?id=<%= lists.getBookId() %>" class="btn btn-sm btn-danger"><i class="fa-solid fa-trash"></i>Delete</a>
				
				</td>
			</tr>
			
			<%
		}
		
		%>
			
			
		</tbody>
	</table>

	<div style="margin-top: 250px">
	<%@ include file="footer.jsp" %>
	</div>
</body>
</html>