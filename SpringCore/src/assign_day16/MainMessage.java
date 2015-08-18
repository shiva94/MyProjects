package assign_day16;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainMessage {

	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("assign_day16/Spring1.xml"));
		MyMessageSender message = (MyMessageSender) factory.getBean("message");
		message.msg();
	}
	
}
