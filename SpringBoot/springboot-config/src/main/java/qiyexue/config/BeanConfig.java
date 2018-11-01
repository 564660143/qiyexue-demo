package qiyexue.config;

import org.springframework.context.annotation.Bean ;
import org.springframework.context.annotation.Configuration ;
import org.springframework.context.annotation.ImportResource ;
import qiyexue.beanconfig.TestBean2 ;

//  此处为配置项
@Configuration
@ImportResource(locations={"classpath:spring-common.xml"})
public class BeanConfig {
	
	// 此处返回的是一个Spring的配置Bean，与xml的“<bean>”等价
	@Bean 
	// 方法名称随便写
	public TestBean2 geTestBean2(){
		return new TestBean2();
	}
	
}
