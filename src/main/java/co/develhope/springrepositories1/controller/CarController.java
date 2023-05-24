package co.develhope.springrepositories1.controller;
import co.develhope.springrepositories1.entities.Car;
import co.develhope.springrepositories1.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarRepository carRepository;
    @PostMapping
    public Car create(@RequestBody Car car) {
        Car carsaved = carRepository.saveAndFlush(car);
        return carsaved;
    }
    @GetMapping
    public List<Car> findAllCar() {
        return carRepository.findAll();
    }
}