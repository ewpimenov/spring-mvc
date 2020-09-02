package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> carList = new ArrayList<>();

    public List<Car> getAllCars(){
        carList.add(new Car("Vaz","21093"));
        carList.add(new Car("Daf","156"));
        carList.add(new Car("Man","777"));
        return carList;
    }
}
