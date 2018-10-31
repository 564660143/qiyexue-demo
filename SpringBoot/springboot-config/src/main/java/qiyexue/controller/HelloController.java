package qiyexue.controller;

import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RestController ;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String hello(){
		return "hello 七夜雪";
	}
	
}
