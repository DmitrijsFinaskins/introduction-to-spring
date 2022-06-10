package io.proj3ct.springstarter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = io.proj3ct.springstarter.SpringConfig.class)
class SpringStarterApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void valuesForTest(){
		ApplicationContext ctx = new
				AnnotationConfigApplicationContext(SpringConfig.class);

		Car car = ctx.getBean("carWithModelValue" ,Car.class);

		assertEquals("Audi", car.getManufacturer());
	}
}
