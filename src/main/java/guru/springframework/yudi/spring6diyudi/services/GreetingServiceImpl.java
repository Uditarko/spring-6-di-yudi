package guru.springframework.yudi.spring6diyudi.services;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello from GreetingServiceImpl";
    }
}
