package day15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int empcode= Integer.parseInt(request.getParameter("empcode"));
		//String empname=request.getParameter("empname");
		Employee emp=new Employee();
		emp.setEmpcode(empcode);
		//emp.setEmpname(empname);
		EmployeeDAOImpl dao = new EmployeeDAOImpl();
		dao.update(emp);
		out.println("Record Updated");
	}

}
