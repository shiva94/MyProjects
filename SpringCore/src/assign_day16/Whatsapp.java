package assign_day16;

public class Whatsapp implements MessagingService {

	@Override
	public void sendMessage(String receiverName, String msg) {
		
		System.out.println("Receiver: "+receiverName+" "+"The message is: " +msg);
		
	}

}
