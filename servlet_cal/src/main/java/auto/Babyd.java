package auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Babyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new AnnotationConfigApplicationContext(Baby.class);
		Baby b=(Baby)ac.getBean("baby");
		b.eating();

	}

}
