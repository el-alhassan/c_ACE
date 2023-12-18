package com.example.controle_ace.dao.repositories;

import com.example.controle_ace.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
    public Car findCarByModel(String model);
    public Car findCarByModelAndPrice(String model, Float price);
}
