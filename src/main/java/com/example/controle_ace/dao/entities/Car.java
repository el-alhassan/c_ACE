package com.example.controle_ace.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity @NoArgsConstructor @AllArgsConstructor @Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_Car;
    String model;
    String color;
    String matricule;
    Float price;
}
