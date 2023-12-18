package com.example.controle_ace.service;
import com.example.controle_ace.dao.entities.Car;
import com.example.controle_ace.service.dtos.CarDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface CarManager {
     CarDTO getCarbyModel(String model);
     CarDTO getCarbyModelAndPrice(String model,Float price);

     void addCar(CarDTO carDTO);
     void deleteCar(Long id);
}
