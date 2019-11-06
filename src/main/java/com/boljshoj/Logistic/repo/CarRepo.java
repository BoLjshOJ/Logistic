package com.boljshoj.Logistic.repo;

import com.boljshoj.Logistic.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
