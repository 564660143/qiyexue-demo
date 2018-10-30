package qiyexue.path;

import org.springframework.stereotype.Controller ;
import org.springframework.web.bind.annotation.PathVariable ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.ResponseBody ;

@Controller
public class PathConfig {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "Hello World";
	}
	
	/**
	 * URL方式接收参数
	 * @param msg
	 * @return
	 */
	@RequestMapping("/say")
	@ResponseBody
	public String say(String msg){
		// 访问路径 http://localhost:8080/say?msg=qiyexue
		// URL中的msg参数要和方法中msg名称一致
		return "Hello " + msg;
	}
	
	/**
	 * Rest方式接收参数
	 * @param msg
	 * @return
	 */
	@RequestMapping("/rest/{message}")
	@ResponseBody
	public String rest(@PathVariable("message") String msg){
		// 访问路径 http://localhost:8080/rest/qiyexue
		return "Hello " + msg;
	}
}
