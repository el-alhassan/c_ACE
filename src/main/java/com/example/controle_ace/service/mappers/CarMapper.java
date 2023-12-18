package com.example.controle_ace.service.mappers;

import com.example.controle_ace.dao.entities.Car;
import com.example.controle_ace.service.dtos.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public CarDTO fromCartoCarDTO(Car car) {

        return this.modelMapper.map(car, CarDTO.class);
    }
    public Car fromCarDTOtoCar(CarDTO carDTO) {

        return this.modelMapper.map(carDTO, Car.class);
    }
}
