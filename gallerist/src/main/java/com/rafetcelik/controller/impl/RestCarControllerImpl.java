package com.rafetcelik.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafetcelik.controller.IRestCarController;
import com.rafetcelik.controller.RestBaseController;
import com.rafetcelik.controller.RootEntity;
import com.rafetcelik.dto.DtoCar;
import com.rafetcelik.dto.DtoCarIU;
import com.rafetcelik.service.ICarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/rest/api/car")
public class RestCarControllerImpl extends RestBaseController implements IRestCarController{
	
	@Autowired
	private ICarService carService;
	
	@PostMapping(path = "/save")
	@Override
	public RootEntity<DtoCar> saveCar(@Valid @RequestBody DtoCarIU dtoCarIU) {
		return ok(carService.saveCar(dtoCarIU));
	}

}
