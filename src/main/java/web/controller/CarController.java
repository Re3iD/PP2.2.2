package web.controller;

import models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping(value="/cars")
    public String carTable(@RequestParam(value = "count",required = false,defaultValue = "5") int count,
                           ModelMap model){
        if(Double.isNaN((double)count)) count = 5;
        List<Car> cars = carService.getCarList(count);
        model.addAttribute("carTable",cars);
        return "cars";
    }

}
