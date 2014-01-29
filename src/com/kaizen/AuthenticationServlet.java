package com.kaizen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AuthenticationServlet
 */
	public class AuthenticationServlet extends HttpServlet {

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    request.getSession(true);
		    out.println("<HTML><HEAD><TITLE>Access Denied</TITLE></HEAD>");
		      out.println("<BODY>Your login and password are invalid.<BR>");
		      out.println("You may want to <A HREF=\"index.html\">Try again</A>");
		      out.println("</BODY></HTML>");
		
		}

		
		
		  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,
		      IOException {
		    res.setContentType("text/html");
		    
		 
		    
		    PrintWriter out = res.getWriter();
		    
		    String account = req.getParameter("account");
		    String password = req.getParameter("password");
		    String location = req.getParameter("location");
			System.out.println("calling authentication method");  
		    if (!allowUser(account, password)) {
		      out.println("<HTML><HEAD><TITLE>Access Denied</TITLE></HEAD>");
		      out.println("<BODY>Your login and password are invalid.<BR>");
		      out.println("You may want to <A HREF=\"index.html\">Try again</A>");
		      out.println("</BODY></HTML>");
		    } else {
		      // Try redirecting the client to the page he first tried to access
		    	req.setAttribute("account", account);
		    	req.setAttribute("password", password);
		      try {
		    	  out.println("<HTML><HEAD><TITLE>Access </TITLE></HEAD>");
			      out.println("<BODY>Your login and password are valid.<BR>");
			      out.println("user id is " + account );
			      out.println("password is " + password );
			      out.println("location is " + location);

			      out.println("</BODY></HTML>");
		          return;
		      } catch (Exception ignored) {
		      }

		     
		    }
		  }

		  protected boolean allowUser(String account, String password) {
			System.out.println("Inside authentication method");
			if(account != null && account.trim().equals("david"))
			{
			    return true; // trust everyone
				
			}
			else
			{
				return false;
			}
		  }
		}