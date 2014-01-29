package com.kaizen;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogIpAddressFilter
 */
	public class SecondFilter implements Filter {
	    public void doFilter(ServletRequest req, ServletResponse res,
	            FilterChain chain) throws IOException, ServletException {
	        HttpServletRequest request = (HttpServletRequest) req;
	        String ipAddress = request.getRemoteAddr();
	        System.out.println("IP "+ipAddress + ", Time "
	                            + new Date().toString());
	      chain.doFilter(req, res);
	        PrintWriter out = null; 
	        res.setContentType("text/html");
	        out = res.getWriter(); 
	        out.println("<h2>Sorry your authentication failed </h2>");
	    }
	    public void init(FilterConfig config) throws ServletException {
	        System.out.println("Init Method");
	    }
	    public void destroy() {
	        //add code to release any resource
	    }
	}

