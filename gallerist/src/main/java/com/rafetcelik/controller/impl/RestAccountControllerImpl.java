package com.rafetcelik.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafetcelik.controller.IRestAccountController;
import com.rafetcelik.controller.RestBaseController;
import com.rafetcelik.controller.RootEntity;
import com.rafetcelik.dto.DtoAccount;
import com.rafetcelik.dto.DtoAccountIU;
import com.rafetcelik.service.IAccountService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/rest/api/account")
public class RestAccountControllerImpl extends RestBaseController implements IRestAccountController{
	
	@Autowired
	private IAccountService accountService;
	
	@PostMapping(path = "save")
	@Override
	public RootEntity<DtoAccount> saveAccount(@Valid @RequestBody DtoAccountIU dtoAccountIU) {
		return ok(accountService.saveAccount(dtoAccountIU));
	}

}
