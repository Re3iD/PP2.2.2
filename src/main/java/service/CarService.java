package service;

import models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carList = initList();
    private List<Car> initList(){
        carList = new ArrayList<>();
        carList.add(new Car(111,"Ford","Escape"));
        carList.add(new Car(148,"Chevrolet","Impala"));
        carList.add(new Car(111,"Ford","Focus III"));
        carList.add(new Car(111,"Opel","Astra"));
        carList.add(new Car(111,"Audi","A4"));
        return carList;
    }

    public List<Car> getCarList(int count) {
        List<Car> output = new ArrayList<>();
        for(int i=0;i<count;i++){
            if(count>=5){
                output = carList;
                break;
            }
            output.add(carList.get(i));
        }
        return output;
    }
}
