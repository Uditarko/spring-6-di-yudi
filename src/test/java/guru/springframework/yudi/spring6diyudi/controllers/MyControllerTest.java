package guru.springframework.yudi.spring6diyudi.controllers;

import guru.springframework.yudi.spring6diyudi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    MyController myController;

    @BeforeEach
    void setUp() {
        myController = new MyController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(myController.sayHello());
    }
}