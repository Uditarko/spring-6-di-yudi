package guru.springframework.yudi.spring6diyudi.controllers;

import guru.springframework.yudi.spring6diyudi.services.GreetingService;
import guru.springframework.yudi.spring6diyudi.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
