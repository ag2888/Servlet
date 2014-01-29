package com.kaizen;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTagAttribute extends SimpleTagSupport {

		   private String message;


		   public void setMessage(String msg) {
		      this.message = msg;
		   }


		   public void doTag()
		      throws JspException, IOException
		    {
			   
			  String abc = method1(message);
		       if (message != null) {
		          /* Use message from attribute */
		          JspWriter out = getJspContext().getOut();
		          out.println("Hello World -"+ message  + abc);
		       }
		       else {
		          getJspContext().getOut().println("No attribute present. Please check.");
		       }
		   }
		   
		   public String method1(String message) {
			   
			   return message + "ankit";
			   
		   }
		   }

		