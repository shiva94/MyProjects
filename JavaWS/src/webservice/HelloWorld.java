package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface HelloWorld{		//Service Endpoint Interface(SEI)
	@WebMethod
	public String greetings(String name);
	@WebMethod
	public int add(int a,int b);
}
