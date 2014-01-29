package com.kaizen;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
public class SessionListener implements HttpSessionListener {
	  private static int sessions;
	  public static int getTotalNoOfActiveSession() {
	    return sessions;
	  }
	  public void sessionCreated(HttpSessionEvent arg) {
	    sessions++;
	    System.out.println("Inside one session is added to counter   "+sessions);
	  }
	  public void sessionDestroyed(HttpSessionEvent arg) {
	    sessions--;
	    System.out.println("Inside one session is deduct from counter   "+sessions);
	  }
	}