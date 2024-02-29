<%@page import="com.kuu.beans.UserBO"%>
<%@page import="com.kuu.beans.BookDetails"%>
<%@page import="java.util.List"%>
<%@page import="com.kuu.dao.BookDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>	    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

#toast {
	min-width: 300px;
	position: fixed;
	bottom: 30px;
	left: 50%;
	margin-left: -125px;
	background: #333;
	padding: 10px;
	color: white;
	text-align: center;
	z-index: 1;
	font-size: 18px;
	visibility: hidden;
	box-shadow: 0px 0px 100px #000;
}

#toast.display {
	visibility: visible;
	animation: fadeIn 0.5, fadeOut 0.5s 2.5s;
}

@keyframes fadeIn {from { bottom:0;
	opacity: 0;
}

to {
	bottom: 30px;
	opacity: 1;
}

}
@keyframes fadeOut {form { bottom:30px;
	opacity: 1;
}

to {
	bottom: 0;
	opacity: 0;
}
}


 </style>
<meta charset="ISO-8859-1">
<title>All New Book</title>
<%@ include file="all_component/allcss.jsp"%>
</head>
<body style="background-color: #f7e7e6">

<% 

   UserBO user =(UserBO)session.getAttribute("userobj") ;

%>
<c:if test="${not empty addcart }">
<div id="toast">${addcart }</div>

<script type="text/javascript">
		showToast();
		function showToast(content)
		{
		    $('#toast').addClass("display");
		    $('#toast').html(content);
		    setTimeout(()=>{
		        $("#toast").removeClass("display");
		    },2000)
		}	
</script>

<c:remove var="addcart" scope="session"/>
</c:if>
	<%@ include file="all_component/navbar.jsp"%>
	<div class="container">
		<h3 class="text-center">All New Book</h3>
		<div class="row">

			<%
			BookDAOImpl dao = new BookDAOImpl();
			List<BookDetails> list = dao.getNewBook();
			for (BookDetails books : list) {
			%>
			<div class="col-md-3.5">
				<div class="card">
					<div class="card-body text-center">
						<img alt="" src="books/<%=books.getPhotoName()%>"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p><%=books.getBookname()%></p>
						<p><%=books.getAuthor()%></p>
						<p>
							Categories :
							<%=books.getBookCategory()%></p>
						<div class="row">
							<%
						
						if(user==null){
							
							%>
							<a href="login.jsp" class="btn btn-danger btn-sm ml-1"><i
								class="fa-solid fa-cart-shopping"></i>Add Cart</a>
							<%
						}else{
							%>
							<a href="cart?bid=<%=books.getBookId() %>&&uid=<%=user.getId() %>" class="btn btn-danger btn-sm ml-1"><i
								class="fa-solid fa-cart-shopping"></i>Add Cart</a>
							<%
						}
						
						
						%>
							 <a href="view_books.jsp?bid=<%=books.getBookId() %>"
								class="btn btn-success btn-sm ml-1">View Details</a> <a href=""
								class="btn btn-danger btn-sm ml-1"><%=books.getPrice()%> <i
								class="fa-solid fa-indian-rupee-sign"></i></a>

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