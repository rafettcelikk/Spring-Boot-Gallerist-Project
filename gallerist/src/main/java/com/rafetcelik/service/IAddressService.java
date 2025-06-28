package com.rafetcelik.service;

import com.rafetcelik.dto.DtoAddress;
import com.rafetcelik.dto.DtoAddressIU;

public interface IAddressService {
	
	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}
