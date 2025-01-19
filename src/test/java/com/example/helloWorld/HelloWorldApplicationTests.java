package com.example.helloWorld;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.helloWorld.controller.HelloController;

@SpringBootTest
class HelloWorldApplicationTests {
	@Test
    public void testSayHello() {
        HelloController controller = new HelloController();
        String response = controller.sayHello();
        assertThat(response).isEqualTo("Hello World!");
    }
}
