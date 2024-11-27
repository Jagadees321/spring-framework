package servlet_cal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Dogd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new AnnotationConfigApplicationContext(Myconfig.class);
		Dog d=(Dog) ac.getBean("dog");
		System.out.println(d);
		AbstractApplicationContext aac=(AbstractApplicationContext)ac;
		aac.close();

	}

}
