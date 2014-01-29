package com.kaizen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.ArrayList;
/**
 * Servlet implementation class MultipleValueFieldHandlerServlet
 */
public class MultipleValueFieldHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultipleValueFieldHandlerServlet() {
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
		
			String[] selectedOptions = request.getParameterValues("options");
			
			ArrayList<String> selectedOptionLabels = null;
			
			if(selectedOptions != null)
			{
				
				selectedOptionLabels = new ArrayList<String>(selectedOptions.length);
			
				for ( String selectedOption : selectedOptions)
				{
					if(selectedOption.equals("option1"))
					{
						selectedOptionLabels.add("Option 1");
						
					}
					
					else if(selectedOption.equals("option2"))
					{
						selectedOptionLabels.add("Option 2");
					}
					
					else if(selectedOption.equals("option3"))
					{
						selectedOptionLabels.add("Option 3");
					}
					
				}
			
			}
			
			request.setAttribute("checkedLabels", selectedOptionLabels);
			
			try {
				request.getRequestDispatcher("confirmationservlet").forward(request,response);
			}
			catch(ServletException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
		
	}

}
