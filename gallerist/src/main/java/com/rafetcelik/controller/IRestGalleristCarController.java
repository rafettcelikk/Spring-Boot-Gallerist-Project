package com.rafetcelik.controller;

import com.rafetcelik.dto.DtoGalleristCar;
import com.rafetcelik.dto.DtoGalleristCarIU;

public interface IRestGalleristCarController {
	
	public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
