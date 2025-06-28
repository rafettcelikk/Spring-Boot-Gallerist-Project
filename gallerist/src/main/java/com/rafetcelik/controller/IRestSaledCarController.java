package com.rafetcelik.controller;

import com.rafetcelik.dto.DtoSaledCar;
import com.rafetcelik.dto.DtoSaledCarIU;

public interface IRestSaledCarController {
	
	public RootEntity<DtoSaledCar> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
