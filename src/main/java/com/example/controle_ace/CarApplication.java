package com.example.controle_ace;


import com.example.controle_ace.dao.entities.Car;
import com.example.controle_ace.dao.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.controle_ace.dao.repositories")
@EntityScan(basePackages = "com.example.controle_ace.dao.entities")
public class CarApplication {
    @Autowired
    CarRepository carRepository;

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);

    }
    @Bean
    CommandLineRunner start() {
        return args -> {
            System.out.println("test");
            carRepository.save(Car.builder().id_Car(1L).color("red").price(50f).model("BMW").matricule("12345").build());
            carRepository.save(Car.builder().id_Car(2L).color("green").price(60f).model("SEAT").matricule("15267").build());
            carRepository.save(Car.builder().id_Car(3L).color("blue").price(70f).model("TOYOTA").matricule("89300").build());
            carRepository.save(Car.builder().id_Car(4L).color("yellow").price(80f).model("fiat").matricule("19840").build());
        };
    }
}
