package com.rafetcelik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafetcelik.model.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Long>{

}
