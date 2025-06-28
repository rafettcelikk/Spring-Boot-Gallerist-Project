package com.rafetcelik.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafetcelik.controller.IRestCustomerController;
import com.rafetcelik.controller.RestBaseController;
import com.rafetcelik.controller.RootEntity;
import com.rafetcelik.dto.DtoCustomer;
import com.rafetcelik.dto.DtoCustomerIU;
import com.rafetcelik.service.ICustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/rest/api/customer")
public class RestCustomerControllerImpl extends RestBaseController implements IRestCustomerController{
	
	@Autowired
	private ICustomerService customerService;

	@PostMapping(path = "/save")
	@Override
	public RootEntity<DtoCustomer> saveCustomer(@Valid @RequestBody DtoCustomerIU dtoCustomerIU) {
		return ok(customerService.saveCustomer(dtoCustomerIU));
	}
	
	
}
