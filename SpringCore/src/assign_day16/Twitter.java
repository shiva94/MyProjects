package assign_day16;

public class Twitter implements MessagingService {

	@Override
	public void sendMessage(String receiverName, String msg) {
		
		System.out.println("Receiver: "+receiverName+" "+ "The tweet is: "+msg);
		
	}

}
