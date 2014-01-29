
package com.kaizen;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class RequestListener
 */
	public class RequestListener implements ServletRequestListener {

		  private static long reqCount;

		  public void requestInitialized(ServletRequestEvent sre) {

		    ServletContext context = sre.getServletContext();
		    ServletRequest request = sre.getServletRequest();

		    synchronized (context) {
		      context
		          .log("Request for "
		              + (request instanceof HttpServletRequest ? ((HttpServletRequest) request)
		                  .getRequestURI()
		                  : "Unknown") + "; Count=" + ++reqCount);
		    }

		  }

		  public void requestDestroyed(ServletRequestEvent sre) {

		  }

		}
