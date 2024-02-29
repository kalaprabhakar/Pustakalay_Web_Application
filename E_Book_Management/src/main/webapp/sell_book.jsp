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

	<div class="container p-4">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
					<h5 class="text-center text-primary">Sell Old Book</h5>
						<form method="post" action="addoldbook" enctype="multipart/form-data">
						<input type ="hidden" name="email" value="${userobj.email }">
							<div class="form-group">
								<label for="exampleInputEmail1">Book Name </label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="bname">

							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Author Name </label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="author">

							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Price </label> <input
									type="number" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="price">

							</div>



							<div class="form-group">
								<label for="exampleFormControlFile1">Upload Photo</label> <input
									name="bimg" type="file" class="form-control-file"
									id="exampleFormControlFile1">

							</div>
							<button type="submit" class="btn btn-primary">Sell</button>
						</form>

					</div>
				</div>

			</div>

		</div>

	</div>

</body>
</html>