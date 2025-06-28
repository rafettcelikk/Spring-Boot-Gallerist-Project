package com.rafetcelik.controller;

import com.rafetcelik.dto.DtoCar;
import com.rafetcelik.dto.DtoCarIU;

public interface IRestCarController {
	
	public RootEntity<DtoCar> saveCar(DtoCarIU dtoCarIU);
}
