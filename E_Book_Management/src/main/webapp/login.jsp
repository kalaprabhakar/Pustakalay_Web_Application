<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pustakalaya : Login</title>
<%@ include file="all_component/allcss.jsp"%>
</head>
<body style="background-color: #f7e7e6">
	<%@ include file="all_component/navbar.jsp"%>

	<div class="container p-2">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
					<h5 class="text-center">Login</h5>
					<c:if test ="${not empty failedMsg }">
					   <h5 class="text-center text-danger">${failedMsg}</h5>
					   <c:remove var="failedMsg" scope="session"/>
					</c:if>
					
					<c:if test ="${not empty succMsg }">
					   <h5 class="text-center text-success">${succMsg}</h5>
					   <c:remove var="succMsg" scope="session"/>
					</c:if>
						<form method="post" action="./login">
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" required="required" name="email">

							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1" required="required" name="password">
							</div>
							
							<div class="text-center">
								<button type="submit" class="btn btn-primary">Submit</button><br>
								<a href="register.jsp">Create Account</a>

							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>