package com.rafetcelik.controller;

import com.rafetcelik.dto.DtoAccount;
import com.rafetcelik.dto.DtoAccountIU;

public interface IRestAccountController {
	
	public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);
}
