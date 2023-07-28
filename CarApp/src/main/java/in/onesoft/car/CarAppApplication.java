package in.onesoft.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CarAppApplication extends SpringBootServletInitializer{
	
	@Override  
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)   
	{  
	return application.sources(CarAppApplication.class);  
	}  
	public static void main(String[] args) {
		 SpringApplication.run(CarAppApplication.class, args); 
	}
}
