package guru.springframework.yudi.spring6diyudi;

import guru.springframework.yudi.spring6diyudi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiYudiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6DiYudiApplication.class, args);
		System.out.println(ctx.getBean(MyController.class).sayHello());
	}

}
