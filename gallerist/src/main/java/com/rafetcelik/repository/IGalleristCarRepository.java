package com.rafetcelik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafetcelik.model.GalleristCar;

@Repository
public interface IGalleristCarRepository extends JpaRepository<GalleristCar, Long>{

}
