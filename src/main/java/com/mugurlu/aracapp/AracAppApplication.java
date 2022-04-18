package com.mugurlu.aracapp;

import com.mugurlu.aracapp.entity.Car;
import com.mugurlu.aracapp.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AracAppApplication implements CommandLineRunner {


    @Autowired
    private CarRepository repository;




    private static final Logger logger = LoggerFactory.getLogger("AracAppApplication.class");

    public static void main(String[] args) {
        SpringApplication.run(AracAppApplication.class, args);

        logger.info("Merhaba Arac App");
    }

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Car("Volkswagen", "Golf", "Black","VW-1243", 2018, 45000));
        repository.save(new Car("Ford", "Mustang", "Red","ADF-1121", 2017, 59000));
        repository.save(new Car("Toyota", "Prius", "Silver","KKO-0212", 2018, 39000));
        repository.save(new Car("Nissan", "Leaf", "White","SSJ-3002", 2014, 29000));






    }
}
