package models;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private int id;
    private String model;
    private String mark;

    public Car(int id,String model,String mark){
        this.id = id;
        this.model=model;
        this.mark=mark;
    }
    public int getId(){
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }
}
