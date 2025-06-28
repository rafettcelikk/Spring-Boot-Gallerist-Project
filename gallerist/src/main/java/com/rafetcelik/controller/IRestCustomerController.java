package com.rafetcelik.controller;

import com.rafetcelik.dto.DtoCustomer;
import com.rafetcelik.dto.DtoCustomerIU;

public interface IRestCustomerController {
	
	public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
