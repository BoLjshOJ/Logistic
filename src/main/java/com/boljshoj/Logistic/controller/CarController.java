package com.boljshoj.Logistic.controller;

import com.boljshoj.Logistic.domain.Car;
import com.boljshoj.Logistic.repo.CarRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController extends AbstractRestController<Car, CarRepo> {
    public CarController(CarRepo repo) {
        super(repo);
    }
}