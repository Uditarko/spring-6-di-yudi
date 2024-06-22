package guru.springframework.yudi.spring6diyudi.controllers.env;

import guru.springframework.yudi.spring6diyudi.services.env.DataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {
    private final DataSourceService dataSourceService;

    public DataSourceController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDSString(){
        return dataSourceService.getDataSource();
    }
}
