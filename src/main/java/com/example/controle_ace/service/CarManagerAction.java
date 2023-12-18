package com.example.controle_ace.service;

import com.example.controle_ace.dao.repositories.CarRepository;
import com.example.controle_ace.service.dtos.CarDTO;
import com.example.controle_ace.service.mappers.CarMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CarManagerAction implements CarManager{
    CarRepository carRepository;
    CarMapper carMapper;
    public CarManagerAction(CarRepository carRepository,CarMapper carMapper){
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }
    @Override
    public CarDTO getCarbyModel(String model) {
        return carMapper.fromCartoCarDTO(carRepository.findCarByModel(model));
    }

    @Override
    public CarDTO getCarbyModelAndPrice(String model, Float price) {
        return carMapper.fromCartoCarDTO(carRepository.findCarByModelAndPrice(model,price));
    }

    @Override
    public void addCar(CarDTO carDTO) {
        carRepository.save(carMapper.fromCarDTOtoCar(carDTO));
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
