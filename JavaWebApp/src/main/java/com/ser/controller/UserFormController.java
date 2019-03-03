package com.ser.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserFormController extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest reqest,HttpServletResponse response) {
        
		  System.out.println("request form client");
		  System.out.println("request form client 2");
	}

}
