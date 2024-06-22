package guru.springframework.yudi.spring6diyudi.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","dev"})
public class DataSourceDevImpl implements DataSourceService{
    @Override
    public String getDataSource() {
        return "dev - url";
    }
}
