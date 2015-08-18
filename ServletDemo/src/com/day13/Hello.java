package com.day13;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
	ServletContext sc;
	RequestDispatcher rd;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sc=request.getServletContext();
		rd=sc.getRequestDispatcher("/sec");
	PrintWriter pw = response.getWriter();
	pw.println(sc.getInitParameter("value"));
	
	//pw.print("first program");
	/*pw.print("<html>"+ 
	"<form name=form>" 
	+"<table align=center>"
	+ "<tr>"
	+"<td>Name:</td>"
	+"<td><input type=text name=name></input></td>"
	+"</tr>"
	+"<tr>"
	+"<td>Age:</td>"
	+"<td><input type=text name=age></input></td>"
	+"</tr>"

	+"<tr>"
	+"<td>Job:</td>"
	+"<td><select name=job>"
		+"<option value=doc>Doctor</option>"
		+"<option value=Lec>Lecturer</option>"
		+"<option value=Tr>Trainer</option>"
		+"</select>"
		+"</td>"
		+"</tr>"
	+"<tr>"
	+"</table>"
	+"</form>"
	+"</html>"
	);*/
	//pw.print(""+request.getParameter("value"));
	String name=request.getParameter("value1");
	if(name.equals("verizon"))
	{
		rd.forward(request,response);
	}
	else
	{
		pw.print("Sorry invalid");
	}
	

}
}
