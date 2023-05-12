package web.CarService;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiseImpl implements CarService{
    @Override
    public List<Car> getSomeCars( List<Car> cars ,Integer count) {
        if (count == null){
            return cars;
        }
        List <Car> outCars = new ArrayList<>();
        int i = 0;
        while ( i < count && i < 5) {
            outCars.add(cars.get(i));
            i++;
        }
        return outCars;
    }
}
