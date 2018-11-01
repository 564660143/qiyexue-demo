package qiyexue.controller;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RestController ;
import qiyexue.beanconfig.TestBean ;
import qiyexue.beanconfig.TestBean2 ;
import qiyexue.beanconfig.TestBean3 ;

@RestController
public class HelloController {
	
	@Autowired
	private TestBean testBean;
	
	@Autowired
	private TestBean2 testBean2;
	
	@Autowired
	private TestBean3 testBean3;
	
	@RequestMapping("/")
	public String hello(){
		return "hello 七夜雪";
	}
	
	@RequestMapping("/say")
	public String say(){
		return testBean.say();
	}
	
	@RequestMapping("/bye")
	public String bye(){
		return testBean2.bye();
	}
	
	@RequestMapping("/info")
	public String testBean3(){
		return testBean3.info();
	}
	
	
}
