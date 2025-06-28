package com.rafetcelik.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafetcelik.controller.IRestGalleristController;
import com.rafetcelik.controller.RestBaseController;
import com.rafetcelik.controller.RootEntity;
import com.rafetcelik.dto.DtoGallerist;
import com.rafetcelik.dto.DtoGalleristIU;
import com.rafetcelik.service.IGalleristService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/rest/api/gallerist")
public class RestGalleristControllerImpl extends RestBaseController implements IRestGalleristController{
	
	@Autowired
	private IGalleristService galleristService;
	
	@PostMapping(path = "/save")
	@Override
	public RootEntity<DtoGallerist> saveGallerist(@Valid @RequestBody DtoGalleristIU dtoGalleristIU) {
		return ok(galleristService.saveGallerist(dtoGalleristIU));
	}

}
