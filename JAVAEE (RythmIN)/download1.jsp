<%@ page import="java.io.*"%>

<% 
	String mname=request.getParameter("mname");
	String sname=request.getParameter("sname");
	String full=getServletContext().getRealPath("/")+"/Songs/"+mname+"/"+sname;
	File f=new File(full);
	FileInputStream fis=new FileInputStream(f);
	BufferedInputStream bis=new BufferedInputStream(fis);
	byte []b=new byte[(int)f.length()];
	bis.read(b,0,(int)f.length());
	response.addHeader("content-disposition","attachment;filename="+sname);
	response.getOutputStream().write(b);
	bis.close();
%>
