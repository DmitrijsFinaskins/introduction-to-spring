package io.proj3ct.springstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("beanFromClass")
public class Car {

    @Autowired
    private CarEngine carEngine;


    public void getEngineModel() {
        System.out.println(carEngine.getEngineTYpe());
    }
}
