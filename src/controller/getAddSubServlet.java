package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculate;

/**
 * Servlet implementation class getAddSubServlet
 */
@WebServlet("/getAddSubServlet")
public class getAddSubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAddSubServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String[] values = request.getParameterValues("addSub");
		
		Calculate answer = new Calculate(values);
		
		if (answer.equals("add")){
			request.setAttribute("Mathing", answer);
			
			getServletContext().getRequestDispatcher("addition.jsp").forward(request, response);
		} else {
			request.setAttribute("Mathing", answer);
			
			getServletContext().getRequestDispatcher("subtract.jsp").forward(request, response);
		
		} 
		
		//PrintWriter writer = response.getWriter();
		//writer.println("Selected Value:");
		
		//for(int i = 0; i < values.length; i++) {
		//writer.println(values[i]);
		//}
		//writer.println(answer.toString());
		
		//writer.close();
		
	}

}
