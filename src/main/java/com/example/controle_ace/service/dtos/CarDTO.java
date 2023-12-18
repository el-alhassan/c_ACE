package com.example.controle_ace.service.dtos;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public class CarDTO {
    String model;
    String color;
    Float price;
}
