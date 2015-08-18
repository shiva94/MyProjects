package webservice;

import javax.jws.WebService;

@WebService(endpointInterface= "webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String greetings(String name) {
		
		return "Hello"+ " " + name;
	}

	@Override
	public int add(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
