package qiyexue.path;

import javax.servlet.http.HttpServletRequest ;
import javax.servlet.http.HttpServletResponse ;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RestController ;

@RestController
public class RestPathConfig {
	
	@RequestMapping("/qiyexue")
	public String index(){
		return "七夜雪";
	}
	
	/**
	 * 使用jsp内置对象
	 * @return
	 */
	@RequestMapping("/object")
	public String object(HttpServletRequest request, HttpServletResponse response){
		System.out.println("*** 客户端IP地址：" + request.getRemoteAddr());
		System.out.println("*** 取得客户端响应编码：" + response.getCharacterEncoding());
		System.out.println("*** 取得SessionID：" + request.getSession().getId());
		System.out.println("*** 取得真实路径：" + request.getServletContext().getRealPath("/upload/"));
		return "七夜雪";
	}
	
}
