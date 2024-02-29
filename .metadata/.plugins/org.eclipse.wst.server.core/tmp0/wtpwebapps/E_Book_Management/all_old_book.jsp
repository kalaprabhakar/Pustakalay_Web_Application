<%@page import="com.kuu.beans.BookDetails"%>
<%@page import="java.util.List"%>
<%@page import="com.kuu.dao.BookDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Old Book</title>
<%@ include file="all_component/allcss.jsp"%>
</head>
<body style="background-color: #f7e7e6">
	<%@ include file="all_component/navbar.jsp"%>
	<div class="container">
		<h3 class="text-center">All Old Book</h3>
		<div class="row">
			<%
			BookDAOImpl dao3 = new BookDAOImpl();
			List<BookDetails> list3 = dao3.getOldBook();
			for (BookDetails book3 : list3) {
			%>

			<div class="col-md-3">

				<div class="card">
					<div class="card-body text-center">
						<img alt="" src="books/<%=book3.getPhotoName()%>"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p><%=book3.getBookname()%></p>
						<p><%=book3.getAuthor()%></p>
						<p>
							Categories :
							<%=book3.getBookCategory()%></p>
						<div class="row">

							<a href="view_books.jsp?bid=<%=book3.getBookId() %>" class="btn btn-success btn-sm ml-5">View Details</a> <a
								href="" class="btn btn-danger btn-sm ml-1"><%=book3.getPrice()%>
								<i class="fa-solid fa-indian-rupee-sign"></i></a>

						</div>
					</div>
				</div>
			</div>

			<%
			}
			%>



		</div>


</body>
</html>