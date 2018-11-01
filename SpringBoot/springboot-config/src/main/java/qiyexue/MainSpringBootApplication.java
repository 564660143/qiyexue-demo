package qiyexue;

import org.springframework.boot.SpringApplication ;
import org.springframework.boot.autoconfigure.SpringBootApplication ;
//import org.springframework.context.annotation.ImportResource ;

@SpringBootApplication
//@ImportResource(locations={"classpath:spring-common.xml"})
public class MainSpringBootApplication {
	
	public static void main(String [] args) {
		SpringApplication.run(MainSpringBootApplication.class, args);
	}
}
