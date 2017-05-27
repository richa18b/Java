<%@ page import="java.io.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Music Store | Songs</title>
<style>
h1{	color:red}
a:link {color:blue;background-color:white;text-decoration:none; }
a:visited {color:green;background-color:white;text-decoration:none;  }
a:hover {color:white;background-color:black;text-decoration:underline;  }
a:active {color:orange;background-color:purple;text-decoration:none;  }
</style>
</head>
<body>
<%
	String cname=request.getParameter("cname");
%>
<h1><%=cname %></h1>
<%
	String path=getServletContext().getRealPath("/")+"/Songs/"+cname;
	File src=new File(path);
	File list[]=src.listFiles();
	
	for(File f:list)
	{
%>
<%=f.getName()%>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="play.jsp?cname=<%=cname%>&sname=<%=f.getName()%>">Play</a>&nbsp;&nbsp;
<a href="download.jsp?cname=<%=cname%>&sname=<%=f.getName()%>">Download</a>
<br>
<%
	}
%>
</body>
</html>