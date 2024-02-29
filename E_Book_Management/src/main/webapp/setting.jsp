<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Setting Page</title>
<%@ include file="all_component/allcss.jsp"%>

<style type="text/css">
a {
	text-decoration: none;
	color: black;
}

a:hover {
	text-decoration: none;
}
</style>
</head>
<body style="background-color: #f7e7e6">
	<%@ include file="all_component/navbar.jsp"%>

	<c:if test="${empty userobj }">
		<c:redirect url="login.jsp">
		</c:redirect>

	</c:if>


	<div class="container py-4 text-center">
		<h3>Hello ${userobj.name }</h3>
		<div class="row p-5">

			<div class="col-md-4 ">

				<a href="sell_book.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary">
								<i class="fa-solid fa-book-open fa-3x"></i>
							</div>
							
							<h3>Sell Old Book</h3>
						   <br>
						</div>
					</div>

				</a>


			</div>
			<div class="col-md-4 ">

				<a href="old_book.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary">
								<i class="fa-solid fa-book-open fa-3x"></i>
							</div>
							
							<h3>Old Book</h3>
							<br>
						</div>
					</div>

				</a>


			</div>

			<div class="col-md-4">

				<a href="edit_profile.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary">
								<i class="fa-solid fa-pen-to-square fa-3x"></i>
							</div>
							<h4>Login & Security</h4>
							<h4>(Edit Profile)</h4>
						</div>
					</div>

				</a>


			</div>

		</div>

		<div class="row">

			

			<div class="col-md-6">

				<a href="order.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary">
								<i class="fa-solid fa-box-open fa-3x" style="color: #ff1900;"></i>
							</div>
							<h4>My Order</h4>
							<p>Track Your Order</p>
						</div>
					</div>

				</a>


			</div>
			<div class="col-md-6">

				<a href="helpline.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary">
								<i class="fas fa-user-circle fa-3x" style="color: #63B63E;"></i>
							</div>
							<h4>Help Center</h4>
							<p>24*7 Service</p>
						</div>
					</div>

				</a>


			</div>

		</div>

	</div>

	<%@ include file="all_component/footer.jsp"%>
</body>
</html>