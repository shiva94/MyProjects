package com.suspendRestore;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Servlet implementation class Suspend
 */
@WebServlet("/Suspend")
@RequestMapping("Suspend.htm")
public class Suspend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SuspendRestoreDAO dao=new SuspendRestoreDAOImpl(); 
		List<SuspendBean> suspend=dao.suspend(); 
		request.setAttribute("bean",suspend ); 
		RequestDispatcher rd = 	request.getRequestDispatcher("SuspendRestore.jsp");
		rd.forward(request, response);
	}

}
