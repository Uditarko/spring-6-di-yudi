package guru.springframework.yudi.spring6diyudi.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class DataSourcePRODImpl implements DataSourceService{
    @Override
    public String getDataSource() {
        return "prod - url";
    }
}
