package com.rafetcelik.service;

import com.rafetcelik.dto.DtoSaledCar;
import com.rafetcelik.dto.DtoSaledCarIU;

public interface ISaledCarService {
	
	public DtoSaledCar buyCar(DtoSaledCarIU dtoSaledCarIU);
}
