package io.proj3ct.springstarter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringStarterApplication {


    public static void main(String[] args) {

        ApplicationContext ctx = new
                AnnotationConfigApplicationContext(SpringConfig.class);

        Car car = ctx.getBean("beanFromClass" ,Car.class);

        car.getEngineModel();

    }

}