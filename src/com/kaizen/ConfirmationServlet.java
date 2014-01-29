package com.kaizen;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfirmationServlet
 */
public class ConfirmationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try 
		{
			PrintWriter printWriter;
			List<String> checkLabels = (List<String>) request.getAttribute("checkedLabels");
			response.setContentType("text/html");
			printWriter = response.getWriter();
			printWriter.println("<p>");
			printWriter.print("The Following options were selected:");
			
			printWriter.println("<br/>");
			
			if(checkLabels != null)
			{
				for ( String optionLabel : checkLabels)
				{
					printWriter.print(optionLabel);
					printWriter.println("<br/>");
				}
			}
			
			else
			{
				printWriter.println("None");
			}
			
			
			
		}
		
		catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
		
		
		
		
		
	}

}
