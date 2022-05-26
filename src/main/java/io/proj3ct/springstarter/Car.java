package io.proj3ct.springstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanFromClass")
public class Car {

    @Autowired
    private CarEngine carEngine;


    @Value("${car.manufacturer}")
    private String manufacturer;

    private String model;

    public Car(String model){
        this.model = model;
    }

    public Car(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void getEngineModel() {
        System.out.println(carEngine.getEngineTYpe());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
