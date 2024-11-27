package servlet_cal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Dog {
	static {
		System.out.println("class loading");
	}
	
	{
		System.out.println("object created");
	}
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destory");
	}

}
