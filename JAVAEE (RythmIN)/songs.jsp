<%@ page import="java.io.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>rhythmIN | Online Music Store | Browse by Movies</title>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		
		<style>
			div.motto {
					position: absolute;
    				top: 100px;
    				left: 300px;
    				width: 300px;
   					height: 100px;
   					font-family:"Bradley Hand ITC";
   					font-weight:bold;
   					font-size:1.2em;		
			}
			
			html,body{
    					height: 100%;
			}
			
			h1{
				color:#008080;
				font-family:"Courier New";
   				font-weight:bold;
   				font-size:1.7em;
   				text-align:center;	
   				
			}
			
			div.songs{
						font-family:"Bradley Hand ITC";
   						font-weight:bold;
   						font-size:1.2em;
			
			}
			
		</style>
	
	</head>
	
	<body>
		<div class="container-fluid">
			<div class="media">
				<img class="img-responsive" src="rythm.gif" style="width:400px;height:200px">
				<div class="motto">follow the rhythm of your heart <i class="fa fa-heartbeat" aria-hidden="true"></i></div>
			</div>
		</div>
		<%
			String mname=request.getParameter("mname");
		%>
		<h1><%=mname %></h1>
		<%
			String path=getServletContext().getRealPath("/")+"/Songs/"+mname;
			File src=new File(path);
			File list[]=src.listFiles();
			for(File f:list)
			{
		%>
				<div class="songs">
					<%=f.getName()%>
					<a class="btn btn-default" role="button" href="play.jsp?mname=<%=mname%>&sname=<%=f.getName()%>">Play</a>&nbsp;&nbsp;
					<a class="btn btn-default" role="button" href="download.jsp?mname=<%=mname%>&sname=<%=f.getName()%>">Download</a>
					<br>
				</div>
		<%
			}
		%>
		
		<footer class="container-fluid" style="background-color:#008080; padding:2px">
			<strong style="color:white"> &copy rhythmIN 2016</strong>
			<%
				for(int i=0;i<148;++i) 
				{
			%>
					&nbsp;
			<% 
				} 
			%>
			<a href=""><i class="fa fa-facebook" style="color:white" aria-hidden="true"></i></a>
			&nbsp;&nbsp;&nbsp;
			<a href=""><i class="fa fa-google-plus" style="color:white" aria-hidden="true"></i></a>
			
		</footer>
	</body>
</html>