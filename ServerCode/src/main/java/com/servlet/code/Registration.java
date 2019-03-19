package com.servlet.code;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
//import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings({ "serial", "unused" })
public class Registration extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	String firstName=request.getParameter("FirstName");
	System.out.println("firstName:"+firstName);
	PrintWriter out=response.getWriter();
	ServletConfig config=this.getServletConfig();
		String uname=config.getInitParameter("username");
        String pwd=config.getInitParameter("pwd");	
	response.setContentType("text/html");
	out.write("name fromhtml:"+firstName);
	out.write("<br/>param value form web.xml:"+uname);
out.close();
System.out.println("pwd:"+uname);
	}
}
