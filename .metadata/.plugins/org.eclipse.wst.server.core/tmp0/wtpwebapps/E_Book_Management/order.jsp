<%@page import="com.kuu.beans.UserBO"%>
<%@page import="com.kuu.beans.Book_Order"%>
<%@page import="java.util.List"%>
<%@page import="com.kuu.dao.BookOrderDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Details</title>
<%@ include file="all_component/allcss.jsp"%>
</head>
<body style="background-color: #f7e7e6">
	<%@ include file="all_component/navbar.jsp"%>
	<c:if test="${empty userobj }">
		<c:redirect url="login.jsp">
		</c:redirect>

	</c:if>
	
	
	<div class="container p-1">
	<h3 class="text-center text-primary">Your Order</h3>
	</div>
	<table class="table table-striped mt-3 ">
  <thead class="bg-primary text-white">
    <tr>
      <th scope="col">Order Id</th>
      <th scope="col">Name</th>
      <th scope="col">Book Name</th>
      <th scope="col">Author</th>
      <th scope="col">Price</th>
      <th scope="col">Payment Type</th>
    </tr>
  </thead>
  <tbody>
  <%
  
    UserBO user =  (UserBO)session.getAttribute("userobj");
     
     BookOrderDAOImpl dao = new BookOrderDAOImpl();
     List<Book_Order> list = dao.getBook(user.getEmail());
     
     for(Book_Order book : list){
    	 %>
    	 <tr>
      <th scope="row"><%=book.getOrderId() %></th>
      <td><%=book.getUserName() %></td>
      <td><%=book.getBookName() %></td>
      <td><%=book.getAuthor() %></td>
       <td><%=book.getPrice() %></td>
      <td><%=book.getPayment() %></td>
    </tr>
    	 
    	 <%
     }
   
  %>
    
  </tbody>
</table>

</body>
</html>