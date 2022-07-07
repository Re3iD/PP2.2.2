package web.controller;

import models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value="/cars")
    public String carTable(@RequestParam(value = "count",required = false,defaultValue = "5") int count,
                           ModelMap model){
        CarService carService = new CarService();
        List<Car> cars = carService.getCarList(count);
        model.addAttribute("carTable",cars);
        return "cars";
    }

}
