<html>
	<head>
		<title></title>
	</head>
	<link href="https://unpkg.com/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet"/>

	<body>

	<div class="float-left">
<a href="${pageContext.request.contextPath }/front.jsp"><-Back</a>
</div><br><br><br>
	<%  String status = request.getParameter("status");
		if(status != null){
			if(status.equals("false")){
				out.print("Bad Credentials");
			}else if(status.equals("error")){
				out.print("Some error occured");
			}
		}
		%>

	
	
	<div class="container">
		<form action="${pageContext.request.contextPath }/Loginprocess" method="post">
		
		<div class="card">
			<div class="card-header">
				Login
			</div>
			<div class="card-body">
				<div class="form-group">
				<input type= "text" name="email" class="form-control" placeholder="Enter email"><br>
				</div>
				<div class="form-group">
				<input type= "password" name="password" class="form-control" placeholder="Enter password"><br>
				</div>
				
			</div>
			<div class="card-footer">
			<input type="submit" value="Login" class="btn btn-primary"><br>
			</div>
			
			
			
		
		</div>
		
		
		</form>
	</div>
	
	
	
	
	
	
	
	</body>

</html>