package com.rafetcelik.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafetcelik.controller.IRestAddressController;
import com.rafetcelik.controller.RestBaseController;
import com.rafetcelik.controller.RootEntity;
import com.rafetcelik.dto.DtoAddress;
import com.rafetcelik.dto.DtoAddressIU;
import com.rafetcelik.service.IAddressService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/rest/api/address")
public class RestAddressControllerImpl extends RestBaseController implements IRestAddressController{
	
	@Autowired
	private IAddressService addressService;
	
	@PostMapping(path = "/save")
	@Override
	public RootEntity<DtoAddress> saveAddress(@Valid @RequestBody DtoAddressIU dtoAddressIU) {
		return ok(addressService.saveAddress(dtoAddressIU));
	}

}
