package billing;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * Servlet implementation class Disc
 */
@WebServlet("/Disc")
public class Disc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter dis= response.getWriter();
		URL url = new URL("http://localhost:8081/billing/disc");
		QName qname= new QName("http://billing/","BillAmtImplService");
		Service service= Service.create(url,qname);
		BillAmt bill = service.getPort(BillAmt.class);
		System.out.println(bill.disAmt(1000,5));
		dis.println(bill.disAmt(1000,10));
	}

}
