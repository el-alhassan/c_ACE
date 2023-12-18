package com.example.controle_ace.web;

import com.example.controle_ace.service.CarManager;
import com.example.controle_ace.service.dtos.CarDTO;
import com.example.controle_ace.service.mappers.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CarGraphQLController {
    @Autowired
    CarManager carManager;

    @QueryMapping
    public CarDTO getCarByModel(@Argument String model){
        System.out.println(carManager.getCarbyModel(model));
        return carManager.getCarbyModel(model);
    }
    @QueryMapping
    public CarDTO getCarByModelAndPrice(@Argument String model, @Argument Float price){
        return carManager.getCarbyModelAndPrice(model,price);
    }
    @MutationMapping
    public void saveCar(@Argument CarDTO carDTO){
        carManager.addCar(carDTO);
    }
    @MutationMapping
    public void deleteCar(@Argument Long id){
        carManager.deleteCar(id);
    }
}
