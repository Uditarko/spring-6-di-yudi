package guru.springframework.yudi.spring6diyudi.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DataSourceControllerDEVTest {

    @Autowired
    DataSourceController dataSourceController;

    @Test
    void getDSString() {
        System.out.println(dataSourceController.getDSString());
    }
}