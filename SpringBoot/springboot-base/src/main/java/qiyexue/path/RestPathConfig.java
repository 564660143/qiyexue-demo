package qiyexue.path;

import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RestController ;

@RestController
public class RestPathConfig {
	
	@RequestMapping("/qiyexue")
	public String index(){
		return "七夜雪11";
	}
	
}
