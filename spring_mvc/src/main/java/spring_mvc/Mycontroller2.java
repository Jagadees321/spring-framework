package spring_mvc;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller2 {
	
	@RequestMapping("/msg")
	@ResponseBody
	public String getmsg() {
		return "<html><body><h1>hii</h1></body></html>";
	}
	@RequestMapping("/print")
	public String printmsg() {
		return "print.jsp";
	}
	@RequestMapping("/inc")
	@ResponseBody
	public String usestateinc(@RequestParam int n1) {
		 n1=n1+1;
		return "<html><body><h1>inc is:"+(n1)+"</h1><a href='inc?n1=+"+n1+"'>increment</a><a href='dec?n1=+"+n1+"'>decrement</a></body></html>";
	}
	@RequestMapping("/dec")
	@ResponseBody
	public String usestatedec(@RequestParam int n1) {
		 n1=n1-1;
		return "<html><body><h1>inc is:"+(n1)+"</h1><a href='inc?n1=+"+n1+"'>increment</a><a href='dec?n1=+"+n1+"'>decrement</a></body></html>";
	}

	@RequestMapping("/add1")
	@ResponseBody
	public String service2(@RequestParam int n1, @RequestParam int n2) {
		return "<html><body><h1>Sum is:"+(n1+n2)+"</h1></body></html>";

	}

}
