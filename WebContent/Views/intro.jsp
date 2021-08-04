<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.ko{
position: relative;
    left: 58%;}
</style>
<link href="https://unpkg.com/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet"/>
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

<div class="container">
 
  <div class="btn-group btn-group-justified">
    <div class="btn-group">
     <a href="${pageContext.request.contextPath }/Views/create.jsp"><button class="btn btn-primary" >CREATE</button></a>
    </div>
    <div class="btn-group">
   <a href="${pageContext.request.contextPath}/createController?action=SHOW"><button  class="btn btn-primary ko" >SHOW</button></a>
    </div>
   
  </div>
</div>
</div>
</body>
</html>