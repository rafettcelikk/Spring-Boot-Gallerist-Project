package com.rafetcelik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafetcelik.model.Car;

@Repository
public interface ICarRepository extends JpaRepository<Car, Long>{

}
