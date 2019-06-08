package car.rental.service;

import car.rental.model.*;
import car.rental.repository.CarRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CarService {

    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostConstruct
    public void carService () {
        carRepository.save(new Car(1, Brand.FORD, Model.FIESTA, BodyType.COMBI, 2010,
                Color.RED, OrderStatus.RENTED, 50.50));

        carRepository.save(new Car(2, Brand.BMW, Model.X5, BodyType.HATCHBACK, 2015,
                Color.BLACK, OrderStatus.AVAILABLE, 60.00));
    }
}
