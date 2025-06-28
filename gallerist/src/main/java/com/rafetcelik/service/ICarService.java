package com.rafetcelik.service;

import com.rafetcelik.dto.DtoCar;
import com.rafetcelik.dto.DtoCarIU;

public interface ICarService {
	
	public DtoCar saveCar(DtoCarIU dtoCarIU);
}
