package assign_day16;

public class MyMessageSender {
	MessagingService service;

	public MessagingService getService() {
		return service;
	}

	public void setService(MessagingService service) {
		this.service = service;
	}
	public void msg(){
		service.sendMessage("asdf","Hello");
	}
}
