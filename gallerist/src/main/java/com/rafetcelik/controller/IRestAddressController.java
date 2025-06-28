package com.rafetcelik.controller;

import com.rafetcelik.dto.DtoAddress;
import com.rafetcelik.dto.DtoAddressIU;

public interface IRestAddressController {
	
	public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
}
