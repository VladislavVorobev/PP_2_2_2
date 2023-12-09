package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    List<Car> carsList = new ArrayList<>();

    public CarServiceImpl() {
        carsList.add(new Car("CAR1", "6000", 1999));
        carsList.add(new Car("CAR2", "2345", 2007));
        carsList.add(new Car("CAR3", "34534", 2018));
        carsList.add(new Car("CAR4", "3234", 2010));
        carsList.add(new Car("CAR5", "67867", 2021));
    }

    @Override
    public List<Car> getCarsFromList(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
