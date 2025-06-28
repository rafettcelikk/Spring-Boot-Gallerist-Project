package com.rafetcelik.service;

import com.rafetcelik.dto.DtoAccount;
import com.rafetcelik.dto.DtoAccountIU;

public interface IAccountService {
	
	public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);
}
