package assign_day16;

public class EmailService implements MessagingService {

	@Override
	public void sendMessage(String receiverName, String msg) {
		System.out.println("Receiver: "+receiverName+" "+"Email: "+msg);
		
	}

}
