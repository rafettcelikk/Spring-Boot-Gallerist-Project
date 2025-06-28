package com.rafetcelik.service;

import com.rafetcelik.dto.DtoGallerist;
import com.rafetcelik.dto.DtoGalleristIU;

public interface IGalleristService {
	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU);
}
