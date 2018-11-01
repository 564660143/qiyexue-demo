package qiyexue.controller;

import java.util.Locale ;
import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.context.MessageSource ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RestController ;

@RestController
public class ResourceController {
	
	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping("/welcome")
	public String welcome(String name){
		System.out.println("访问地址 : " +  messageSource.getMessage("welcome.url", new String[]{name}, Locale.getDefault())) ;
		return messageSource.getMessage("welcome.msg", new String[]{name}, Locale.getDefault());
	}
	
}
