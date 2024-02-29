<%@page import="com.kuu.beans.Cart"%>
<%@page import="com.kuu.beans.UserBO"%>
<%@page import="com.kuu.dao.CartDAOImpl"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart Page</title>
<%@ include file="all_component/allcss.jsp"%>
</head>
<body style="background-color: #f7e7e6">
	<%@ include file="all_component/navbar.jsp"%>
	<c:if test="${empty userobj }">
		<c:redirect url="login.jsp">
		</c:redirect>

	</c:if>

	<c:if test="${not empty succMsg }">

		<div class="alert alert-success text-center" role="alert">${succMsg }</div>
			<c:remove var="succMsg" scope="session"></c:remove>

	</c:if>
	<c:if test="${not empty failedMsg }">

		<div class="alert alert-danger text-center" role="alert">${failedMsg }</div>
			<c:remove var="failedMsg" scope="session"></c:remove>

	</c:if>
	
	<div class="container mt-3 p-2">
		<div class="row">
			<div class="col-md-6">

				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-success">Your Selected Item</h3>

						<table class="table table-striped">
							<thead>
								<tr>
									<th scope="col">Book Name</th>
									<th scope="col">Author</th>
									<th scope="col">Price</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<%
								UserBO user = (UserBO) session.getAttribute("userobj");
								CartDAOImpl dao = new CartDAOImpl();

								List<Cart> list = dao.getBookByUser(user.getId());
								double totalPrice = 0;

								for (Cart c : list) {
									totalPrice = totalPrice + c.getTotalPrice();
								%>
								<tr>
									<th scope="row"><%=c.getBookName()%></th>
									<td><%=c.getAuthor()%></td>
									<td><%=c.getPrice()%></td>
									<td><a href="removebook?bid=<%=c.getBid()%>&&uid=<%=c.getUserId() %>&&cid=<%=c.getCid() %>"
										class="btn btn-sm btn-danger ">Remove</a></td>
								</tr>

								<%
								}
								%>
								<tr>
									<td>Total Price</td>
									<td></td>
									<td></td>
									<td><%=totalPrice%></td>

								</tr>

							</tbody>
						</table>
					</div>
				</div>

			</div>

			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-success">Your Details For Order</h3>
						<form method="post" action="orderlist">
                             <input type="hidden" value="${userobj.id }" name="id">
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="inputEmail4">Name</label> <input type="text"
										class="form-control" id="inputEmail4" name="name" value="<%=user.getName()%>" required="required">
								</div>
								<div class="form-group col-md-6">
									<label for="inputPassword4">Email</label> <input type="email"
										class="form-control" id="inputPassword4"  name="email" value="<%=user.getEmail()%>" required="required">
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="inputEmail4">Mobile Number</label> <input
										type="number" class="form-control" id="inputEmail4" name="phone" value="<%=user.getPhone_no()%>" required="required">
								</div>
								<div class="form-group col-md-6">
									<label for="inputPassword4">Address</label> <input type="text"
										class="form-control" id="inputPassword4" name="addr" required="required">
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="inputEmail4">LandMark</label> <input type="text"
										class="form-control" id="inputEmail4" name="land" required="required">
								</div>
								<div class="form-group col-md-6">
									<label for="inputPassword4">City</label> <input type="text"
										class="form-control" id="inputPassword4" name="city" required="required">
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="inputEmail4">State</label> <input type="text"
										class="form-control" id="inputEmail4" name="state" required="required">
								</div>
								<div class="form-group col-md-6">
									<label for="inputPassword4">Zip</label> <input type="number"
										class="form-control" id="inputPassword4" name="zip" required="required">
								</div>
							</div>

							<div class="form-group">
								<label for="exampleFormControlSelect1">Payment Type</label> <select
									class="form-control" id="exampleFormControlSelect1" name="payment">
									<option value="noselect">----Select----</option>
									<option value="COD">Cash On Delivery</option>

								</select>
							</div>

							<div class="text-center">
								<button class="btn btn-warning">Order Now</button>
								<a href="index.jsp" class="btn btn-success">Continue
									Shopping</a>
							</div>

						</form>
					</div>

				</div>

			</div>

		</div>

	</div>
</body>
</html>