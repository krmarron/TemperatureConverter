//Kasey Marron
package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;

/**
 * Servlet implementation class getFahrenheitServlet
 */
@WebServlet("/getFahrenheitServlet")
public class getFahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFahrenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userTemp = request.getParameter("userTemp");
		
		TempConverter userTemperature = new TempConverter(Double.parseDouble(userTemp));
		userTemperature.f_to_c(Double.parseDouble(userTemp));
		
		request.setAttribute("userTempLog", userTemperature);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(userTemperature.toString());
//		writer.close();	
		
	}

}
