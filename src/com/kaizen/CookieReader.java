package com.kaizen;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieReader extends HttpServlet {

	  public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, java.io.IOException {
	    
		 HttpSession session = request.getSession(); 
		 String ankit = (String) session.getAttribute("product1");
		 Cookie cookie = null;
	    Cookie[] cookies = request.getCookies();
	    boolean hasCookies = false;
	    if (cookies != null)
	      hasCookies = true;
	    response.setContentType("text/html");
	    java.io.PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Cookie information</title>");
	    out.println("</head>");
	    out.println("<body>");
	    if (hasCookies) {
	      out.println("<h2> The name and value of each found cookie</h2>");
	      for (int i = 0; i < cookies.length; i++) {
	        cookie = cookies[i];
	        out.println("Name of cookie #" + (i + 1) + ": "
	            + cookie.getName() + "<br>");
	        out.println("Value of cookie #" + (i + 1) + ": "
	            + cookie.getValue() + "<br><br>");
	      }
	    } else {
	      out.println("<h2> This request did not include any cookies</h2>");
	    }
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	  }

	  public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, java.io.IOException {

	    doGet(request, response);
	  }
	}

