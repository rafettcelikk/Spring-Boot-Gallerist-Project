package com.rafetcelik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafetcelik.model.Account;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Long>{
	
}
