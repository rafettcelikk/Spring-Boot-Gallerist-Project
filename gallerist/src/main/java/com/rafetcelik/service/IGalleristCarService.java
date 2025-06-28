package com.rafetcelik.service;

import com.rafetcelik.dto.DtoGalleristCar;
import com.rafetcelik.dto.DtoGalleristCarIU;

public interface IGalleristCarService {
	
	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
