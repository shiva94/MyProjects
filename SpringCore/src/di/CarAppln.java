package di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarAppln {

	public static void main(String[] args) {
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("day16/Spring.xml"));
		Car car= (Car) factory.getBean("car");
		car.moving();
		 
	}

}
