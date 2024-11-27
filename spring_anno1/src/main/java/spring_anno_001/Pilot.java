package spring_anno_001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pilot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		try {
			
	    Aeroplane al=(Aeroplane) ac.getBean("ae");
		System.out.println(al);
		Aeroplane al1=(Aeroplane) ac.getBean("ae");
		System.out.println(al1);
	}catch(org.springframework.beans.factory.NoSuchBeanDefinitionException c){
		System.out.println("no such bean found");
	}
	}

}
