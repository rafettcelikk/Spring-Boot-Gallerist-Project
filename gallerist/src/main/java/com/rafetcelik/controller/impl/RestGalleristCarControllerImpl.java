package com.rafetcelik.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafetcelik.controller.IRestGalleristCarController;
import com.rafetcelik.controller.RestBaseController;
import com.rafetcelik.controller.RootEntity;
import com.rafetcelik.dto.DtoGalleristCar;
import com.rafetcelik.dto.DtoGalleristCarIU;
import com.rafetcelik.service.IGalleristCarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/rest/api/gallerist-car")
public class RestGalleristCarControllerImpl extends RestBaseController implements IRestGalleristCarController{
	
	@Autowired
	private IGalleristCarService galleristCarService;
	
	@PostMapping(path = "/save")
	@Override
	public RootEntity<DtoGalleristCar> saveGalleristCar(@Valid @RequestBody DtoGalleristCarIU dtoGalleristCarIU) {
		return ok(galleristCarService.saveGalleristCar(dtoGalleristCarIU));
	}

}
