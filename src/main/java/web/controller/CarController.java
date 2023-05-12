package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;
import web.CarService.CarServiseImpl;
import web.models.Car;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @RequestMapping(value = "/cars")
    public String CarsWelcome(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        Car car_1 = new Car( "Tesla", "Model X" , 2020);
        Car car_2 = new Car( "Tesla", "Model y" , 2019);
        Car car_3 = new Car( "Chevrolet", "Impala" , 1967);
        Car car_4 = new Car( "Toyota ", "Mark II" , 1994 );
        Car car_5 = new Car( "Toyota ", "Cresta" , 1997 );

        cars.add(car_1);
        cars.add(car_2);
        cars.add(car_3);
        cars.add(car_4);
        cars.add(car_5);

        CarServiseImpl carServise = new CarServiseImpl();

        cars = carServise.getSomeCars(cars ,count);

        model.addAttribute("cars", cars);
        return "cars";
    }
}