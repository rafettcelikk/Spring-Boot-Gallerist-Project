package com.rafetcelik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafetcelik.model.SaledCar;

@Repository
public interface ISaledCarRepository extends JpaRepository<SaledCar, Long>{

}
