package in.chira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		int count = context.getBeanDefinitionCount();
		String[] names = context.getBeanDefinitionNames();
		
		System.out.println("count:"+count);
		for(String name:names) {
		System.out.println("names:"+name);
		
		}
		
		context.close();
	}

}
