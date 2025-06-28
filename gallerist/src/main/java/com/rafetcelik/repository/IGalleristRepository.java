package com.rafetcelik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafetcelik.model.Gallerist;

@Repository
public interface IGalleristRepository extends JpaRepository<Gallerist, Long>{

}
