package spring_ioc_001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Catdogintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Cat c=(Cat)ac.getBean(Cat.class);
		System.out.println(c.getColor());
		System.out.println(c.getName());
		System.out.println(c.getAge());
		
		
		//ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Dog d=(Dog)ac.getBean(Dog.class);
		System.out.println(d.breed);
		System.out.println(d.name);
		System.out.println(d.h
				
				
				
				
				
				
				
				
				);

	}

}
