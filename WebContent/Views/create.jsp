<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://unpkg.com/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet"/>
<body>
<div class="container">
	<div class="float-right">
<a href="${pageContext.request.contextPath }/logout.jsp">Logout</a>
</div>
<div class="float-left">
<a href="${pageContext.request.contextPath }/Views/intro.jsp"><-Back</a>
</div><br><br><br>
<form action="${pageContext.request.contextPath }/createController" method="POST">
    
	<div class="form-group">
      Enter Name of Item:
      <input type="text" class="form-control" name="itemname" value="${create.itemname}">
    </div>
    <div class="form-group">
     Enter Price of Item: 
      <input type="text" class="form-control" name="price" value="${create.price}">
    </div>
    <div class="form-group">
     Enter Description:
      <input type="text" class="form-control" name="description" value="${create.description}">
    </div><div class="form-group">
      Enter image URL:
      <input type="text" class="form-control"  name="img" value ="${create.img}">
    </div>
    <input type="hidden" value="${create.id}" name="id"/>
	<button type="submit">Save</button>
	
	
	
	
	
</form>
</div>
</body>
</html>