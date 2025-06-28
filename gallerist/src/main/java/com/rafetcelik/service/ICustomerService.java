package com.rafetcelik.service;

import com.rafetcelik.dto.DtoCustomer;
import com.rafetcelik.dto.DtoCustomerIU;

public interface ICustomerService {
	
	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
}
