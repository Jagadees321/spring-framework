package spring_ioc_001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Car c=(Car)ac.getBean(Car.class);
		System.out.println(c);
		System.out.println(c.getE());

	}

}
