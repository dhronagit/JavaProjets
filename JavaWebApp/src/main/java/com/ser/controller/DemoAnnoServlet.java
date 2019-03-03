package com.ser.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ds",urlPatterns="/dem")
public class DemoAnnoServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest reqest,HttpServletResponse response) {
		  System.out.println("annotation based html");
	}
}
