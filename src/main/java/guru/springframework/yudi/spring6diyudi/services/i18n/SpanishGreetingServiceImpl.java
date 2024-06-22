package guru.springframework.yudi.spring6diyudi.services.i18n;

import guru.springframework.yudi.spring6diyudi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello in - ES";
    }
}
