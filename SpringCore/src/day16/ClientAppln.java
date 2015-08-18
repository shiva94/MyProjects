package day16;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientAppln {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"day16/Spring.xml"));
		Employee employee = (Employee) factory.getBean("emp");// getBean(id of
																// xml file)
		//employee.setCode(111);
		//employee.setName("Teja");
		System.out.println(employee.getCode() + " " + employee.getName()+" "+employee.getAddr().getCity());
	}

}
