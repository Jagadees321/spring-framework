package auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "auto")
public class Baby {
   @Autowired
   Ice cream;
   
   public void eating() {
	   System.out.println("start");
	  cream.eat();
	   System.out.println("end");
   }
}
