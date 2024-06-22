package guru.springframework.yudi.spring6diyudi;

import guru.springframework.yudi.spring6diyudi.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiYudiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetControllerFromContext(){
		System.out.println(applicationContext.getBean(MyController.class).sayHello());
	}

	@Test
	public void testInjectedController(){
		System.out.println(myController.sayHello());
	}

}
