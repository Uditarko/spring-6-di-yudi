package guru.springframework.yudi.spring6diyudi.services;

import org.springframework.stereotype.Service;

@Service("greetingServicePI")
public class GreetingServicePropertyInjectedImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello from GreetingServicePropertyInjectedImpl";
    }
}
