package com.suspendRestore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Suspend
 */
@WebServlet("/Suspend")
public class Suspend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				SuspendDAO dao=new SuspendDAOImpl();
				//SuspendBean bean=new SuspendBean();
				List<SuspendBean> suspendlist= new ArrayList<SuspendBean>();
				suspendlist=dao.getServices(Integer.parseInt(request.getParameter("customerID")));
				request.setAttribute("suspendls", suspendlist);
				RequestDispatcher rd= request.getRequestDispatcher("Display.jsp");
				rd.forward(request, response);
	}
}
