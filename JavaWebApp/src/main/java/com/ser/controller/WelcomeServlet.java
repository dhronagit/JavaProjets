package com.ser.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WelcomeServlet implements Servlet {

	public void destroy() {
		System.out.println("destory is method is executed");
		
	}

	public ServletConfig getServletConfig() {
		System.out.println("get ServletConfig");
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("get servletinfo");
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init method is executed");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("reqest is coming from browser");	
		response.getWriter().print("firstNae:"+"maly");
		
		response.getWriter().close();
	}

}
