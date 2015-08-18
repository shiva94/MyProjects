package day15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int empcode= Integer.parseInt(request.getParameter("empcode"));
		String empname=request.getParameter("empname");
		double salary=Double.parseDouble(request.getParameter("salary"));
		Employee emp=new Employee();
		emp.setEmpcode(empcode);
		emp.setEmpname(empname);
		emp.setSalary(salary);
		EmployeeDAOImpl dao = new EmployeeDAOImpl();
		dao.addEmployee(emp);
		out.println("record inserted");
	}

}
