package sc.dit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sc.dit.dto.*;

@WebServlet("/bookS")
public class BookS extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookBean BookB = new BookBean();
		
		BookB.setTitle(request.getParameter("title"));
		BookB.setAuthor(request.getParameter("author"));
		BookB.setPublisher(request.getParameter("publisher"));
		
		RequestDispatcher rd = request.getRequestDispatcher("Report1004/bookOut.jsp");
		rd.forward(request, response);
		
	}

}
