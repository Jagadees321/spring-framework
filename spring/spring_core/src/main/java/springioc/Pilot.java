package springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Pilot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource cpr=new ClassPathResource("spring.xml");
        BeanFactory bf=new XmlBeanFactory(cpr);
        Aero a=(Aero)bf.getBean("a");
        System.out.println(a);
	}

}
