<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://unpkg.com/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet"/>
<body>
<div class="container">
	<div class="float-right">
<a href="${pageContext.request.contextPath }/logout.jsp">Logout</a>
</div>
<p>${message}</p>
<div class="float-left">
<a href="${pageContext.request.contextPath }/userfront.jsp"><-Back</a>
</div><br><br><br>

	<div class="container">
	

	<table border="1" class="table table-striped table-bordered">
		<tr class="thead-dark">
			<th>ID</th>
			<th>Item Name</th>
		    <th>Item Price</th>
		    <th>Description</th>
		    <th>Image</th>
		    <th>Quantity</th>
		    <th>ADD</th>
		</tr>
	
		<c:forEach items ="${list}" var="listt">
		
		<tr>
			<td>${listt.id}</td>
			<td>${listt.itemname}</td>
			<td>${listt.price}</td>
			<td>${listt.description}</td>
			<td><img src="${listt.img}"></img></td>
			<td><input type="text" name="quantity"></td>
			<td>
			<a href="${pageContext.request.contextPath}/cartManagement?action=ACART&item=${listt.id}">Add to Cart</a>
			</td>
		</tr>
		</c:forEach>
	
	</table>
	</div>
	</div>
</body>
</html>