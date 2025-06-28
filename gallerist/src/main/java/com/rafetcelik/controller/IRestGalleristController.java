package com.rafetcelik.controller;

import com.rafetcelik.dto.DtoGallerist;
import com.rafetcelik.dto.DtoGalleristIU;

public interface IRestGalleristController {
	
	public RootEntity<DtoGallerist> saveGallerist(DtoGalleristIU dtoGalleristIU);
}
