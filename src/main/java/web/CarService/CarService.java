package web.CarService;

import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getSomeCars(List<Car> cars , Integer count);
}
