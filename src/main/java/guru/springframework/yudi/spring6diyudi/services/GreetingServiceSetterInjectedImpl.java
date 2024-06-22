package guru.springframework.yudi.spring6diyudi.services;

import org.springframework.stereotype.Service;

@Service("greetingServiceSI")
public class GreetingServiceSetterInjectedImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello from GreetingServiceSetterInjectedImpl";
    }
}
