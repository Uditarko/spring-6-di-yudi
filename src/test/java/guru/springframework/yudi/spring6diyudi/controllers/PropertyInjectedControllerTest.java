package guru.springframework.yudi.spring6diyudi.controllers;

import guru.springframework.yudi.spring6diyudi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}