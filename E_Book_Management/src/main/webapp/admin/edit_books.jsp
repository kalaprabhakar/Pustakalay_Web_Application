<%@page import="com.kuu.beans.BookDetails"%>
<%@page import="com.kuu.dao.BookDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin : Edit Books</title>
<%@ include file="allcss.jsp"%>
</head>
<body style="background-color: #f7e7e6">
	<%@ include file="navbar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Edit Books</h4>
						
						<%
						int id = Integer.parseInt(request.getParameter("id"));
						BookDAOImpl dao = new BookDAOImpl();
						BookDetails book = dao.getBookById(id);
						%>
						<form method="post" action="../editbooks"
							>
							<input type="hidden" name="id" value="<%= book.getBookId()%>">
							<div class="form-group">
								<label for="exampleInputEmail1">Book Name </label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="bname"
									value="<%=book.getBookname()%>">

							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Author Name </label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="author"
									value="<%= book.getAuthor() %>">

							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Price </label> <input
									type="number" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="price"
									value="<%=book.getPrice()%>">

							</div>

							<div class="form-group">
								<label for="inputState">Book Status </label> <select
									id="inputState" name="bstatus" class="form-control">
									<%
									if ("Active".equals(book.getStatus())) {
									%>

                                     <option value="Active">Active</option>
									<option value="Inactive">Inactive</option>

									<%
									} else {
									%>
									<option value="Inactive">Inactive</option>
									<option value="Active">Active</option>


									<%
									}
									%>


								</select>

							</div>

							<button type="submit" class="btn btn-primary">Update</button>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

	<div style="margin-top: 40px">
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>