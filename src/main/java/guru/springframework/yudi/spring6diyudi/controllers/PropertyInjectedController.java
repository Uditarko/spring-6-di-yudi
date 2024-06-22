package guru.springframework.yudi.spring6diyudi.controllers;

import guru.springframework.yudi.spring6diyudi.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
}
