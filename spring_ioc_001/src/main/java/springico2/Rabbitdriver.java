package springico2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Rabbitdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring2.xml");
		Rabbit r=ac.getBean(Rabbit.class, "r");
		System.out.println(r);
	AbstractApplicationContext aac=(AbstractApplicationContext)ac;
	aac.close();
		

	}

}
