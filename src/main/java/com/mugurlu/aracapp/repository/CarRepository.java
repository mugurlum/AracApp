package com.mugurlu.aracapp.repository;

import com.mugurlu.aracapp.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car ,Long> {


    // Fetch cars by brand
    List<Car> findByBrand(String brand);

    //Fetch cars by color
    List<Car> findByColor(String color);

    //Fetch cars by model
    List<Car> findByModel(String model);

    //Fetch cars by year
    List<Car> findByYear(int year);

    //Fetch cars by price
    List<Car> findByPrice(int price);

    //Fetch cars by brand and model
    List<Car> findByBrandAndModel(String color,String model);

    // Fetch cars by brand or color
    List<Car> findByBrandOrColor(String brand, String color);

    // Fetch cars by brand and sort by year
    List<Car> findByBrandOrderByYearAsc(String brand);

    // Fetch cars by brand and sort by year descending
    List<Car> findByBrandOrderByYearDesc(String brand);

    //Fetch cars with brand by JPA Query
    @Query("select c from Car c where c.brand = ?1")
    List<Car> getCarsByBrand(String brand);


    //Fetch cars with brand by JPA Query end with parameter
    @Query("select c from Car c where c.brand like %?1")
    List<Car> getCarsByBrandEndLike(String brand);

    //Fetch cars with brand by JPA Query starts with parameter
    @Query("select c from Car c where c.brand like ?1%")
    List<Car> getCarsByBrandStartLike(String brand);

    //Fetch cars with brand by JPA Query contains with parameter
    @Query("select c from Car c where c.brand like %?1%")
    List<Car> getCarsByBrandContainsLike(String brand);


}
