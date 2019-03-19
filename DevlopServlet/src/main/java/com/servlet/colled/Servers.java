package com.servlet.colled;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servers extends HttpServlet {
	public void service(HttpServletRequest rq, HttpServletResponse rs) {
		System.out.println("service");
	}
	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;

}
