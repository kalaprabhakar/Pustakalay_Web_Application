<%@page import="com.kuu.beans.BookDetails"%>
<%@page import="com.kuu.dao.BookDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="all_component/allcss.jsp"%>
</head>
<body style="background-color: #f7e7e6">
	<%@ include file="all_component/navbar.jsp"%>
	<%
	int bid = Integer.parseInt(request.getParameter("bid"));

	BookDAOImpl dao = new BookDAOImpl();
	BookDetails book = dao.getBookById(bid);
	%>
	<div class="container p-3">
		<div class="row">
			<div class="col-md-6 text-center p-5 border bg-white">
				<img src="books/<%=book.getPhotoName()%>"
					style="height: 150px; width: 150px"><br>
				<h4>
					Book Name : <span class="text-success"><%=book.getBookname()%></span>
				</h4>
				<h4>
					Author Name : <span class="text-success"><%=book.getAuthor()%></span>
				</h4>
				<h4>
					Category : <span class="text-success"><%=book.getBookCategory()%></span>
				</h4>
			</div>
			<div class="col-md-6 text-center p-5 border bg-white">
				<h2><%=book.getBookname()%></h2>
				<%
				if ("Old".equalsIgnoreCase(book.getBookCategory())) {
				%>

				<h5 class="text-primary">Contact to Seller</h5 class="text-primary">
				<h5>
					<i class="fa-solid fa-envelope"></i> Emial :
					<%=book.getEmial()%></h5>
				<%
				}
				%>
				<div class="row">
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fa-solid fa-money-bill-wave fa-2x"></i>
						<p>Cash On Delivery</p>
					</div>
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fa-solid fa-rotate-left fa-2x"></i>
						<p>Return Available</p>
					</div>
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fa-solid fa-truck fa-2x"></i>
						<p>Free Shipping</p>
					</div>
				</div>
 
				<%
				if ("Old".equalsIgnoreCase(book.getBookCategory())) {
				%>
                 <div class="text-center p-3">
					<a href="index.jsp" class="btn btn-success"><i
						class="fa-solid fa-cart-shopping"></i> Continue Shopping</a> <a href=""
						class="btn btn-danger"><i
						class="fa-solid fa-indian-rupee-sign"></i><%=book.getPrice() %></a>
				</div>
                  
				<%
				}else{
					%>
					
					<div class="text-center p-3">
					<a href="" class="btn btn-primary"><i
						class="fa-solid fa-cart-shopping"></i> Add Cart</a> <a href=""
						class="btn btn-danger"><i
						class="fa-solid fa-indian-rupee-sign"></i><%=book.getPrice() %></a>
				</div>
					
					<% 
				}
				%>
			</div>


		</div>

	</div>

</body>
</html>