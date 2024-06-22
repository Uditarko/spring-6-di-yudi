package guru.springframework.yudi.spring6diyudi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello Form GreetingServicePrimaryImpl";
    }
}
