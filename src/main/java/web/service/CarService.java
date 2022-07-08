package web.service;

import models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarService{
    private List<Car> carList = initList();



    private List<Car> initList(){
        carList = new ArrayList<>();
        carList.add(new Car(111,"Ford","Escape"));
        carList.add(new Car(148,"Chevrolet","Impala"));
        carList.add(new Car(215,"Ford","Focus III"));
        carList.add(new Car(16,"Opel","Astra"));
        carList.add(new Car(77,"Audi","A4"));
        return carList;
    }

    public List<Car> getCarList(int count) {
        List<Car> output = new ArrayList<>();

        for(int i=0;i<count;i++){
            //int не может быть равен null метод выкинет исключение;
            if(count<5&&count>=1){
                output.add(carList.get(i));
            }else{
                output = carList;
                break;
            }
        }
        return output;
    }
}
