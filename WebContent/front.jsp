<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style >
.bute{
  position: absolute;
  border: 1px solid red;
  top:80px;
  right: -520px;

}
.butc{
  position: absolute;
  border: 1px solid red;
  top:80px;
  right: -650px;

}
</style>
</head>
<link href="https://unpkg.com/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet"/>
<body>
	<body>
	<%String email = (String)session.getAttribute("email");
	if(email !=null){
		
	   boolean statu=(boolean)session.getAttribute("statu");
	
    	if(email != null && statu==true){
		
		response.sendRedirect("Views/intro.jsp");		
	}else if(email != null && statu==false){
		response.sendRedirect("userfront.jsp");
	}
	}
		
	%>

<div class="container">
	<div class="float-right">
<a href="${pageContext.request.contextPath }/index.jsp">Admin</a>
</div>
<h1 style="text-color:yellow;text-align:center">WELCOME!!!</h1><br><br>
<h4 style="text-color:red;text-align:center">I WANT TO  </h4>
<div class="container">
 
  <div class="btn-group btn-group-justified">
    <div class="btn-group">
     <a href="${pageContext.request.contextPath }/index.jsp"><button class="btn btn-primary bute" >LogIn</button></a>
    </div>
    <div class="btn-group">
   <a href="${pageContext.request.contextPath}/signup.jsp"><button  class="btn btn-primary butc" >SignUp</button></a>
    </div>
   
  </div>
</div>

</body>
</html>