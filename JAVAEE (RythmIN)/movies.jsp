<%@ page import="java.io.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>rhythmIN | Online Music Store</title>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		
		<style>

		</style>
	</head>
	
	<body>
		<%
			String mname=request.getParameter("val");
		%>
		<!--  <h1><%=mname %></h1> -->
		<% 
			String path=getServletContext().getRealPath("/")+"/Songs";
			File src=new File(path);
			File list[]=src.listFiles();
	
			for(File f:list)
			{
				if(f.getName().startsWith(mname))
				{
		%>
					<a href="songs.jsp?mname=<%=f.getName()%>"><%=f.getName()%></a><br>
		<%
				}
			}	
		%>
	</body>
</html>