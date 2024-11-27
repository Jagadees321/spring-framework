package spring_ioc_001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptoptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AppilicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Laptop l=ac.getBean(Laptop.class);
		System.out.println(l);
		System.out.println(l.os);
		System.out.println(l.os.getName());

	}

}
