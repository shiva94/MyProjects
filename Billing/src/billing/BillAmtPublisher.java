package billing;

import javax.xml.ws.Endpoint;

public class BillAmtPublisher {
	public static void main(String args[])
	{
		Endpoint.publish("http://localhost:8081/billing/disc", new BillAmtImpl());
	}
}
