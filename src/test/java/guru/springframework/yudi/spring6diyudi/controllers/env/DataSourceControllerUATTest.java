package guru.springframework.yudi.spring6diyudi.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"uat","EN"})
class DataSourceControllerUATTest {

    @Autowired
    DataSourceController dataSourceController;

    @Test
    void getDSString() {
        System.out.println(dataSourceController.getDSString());
    }
}