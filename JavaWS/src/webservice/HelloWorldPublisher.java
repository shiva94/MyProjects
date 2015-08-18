package webservice;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
	public static void main(String args[])
	{
		Endpoint.publish("http://localhost:8081/webservice/greet",new HelloWorldImpl());
		
	}
}
