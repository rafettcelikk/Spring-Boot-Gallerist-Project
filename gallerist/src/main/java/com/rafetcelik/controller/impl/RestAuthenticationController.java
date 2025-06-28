package com.rafetcelik.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafetcelik.controller.IRestAuthenticationController;
import com.rafetcelik.controller.RestBaseController;
import com.rafetcelik.controller.RootEntity;
import com.rafetcelik.dto.AuthRequest;
import com.rafetcelik.dto.AuthResponse;
import com.rafetcelik.dto.DtoUser;
import com.rafetcelik.dto.RefreshTokenRequest;
import com.rafetcelik.service.IAuthenticationService;

import jakarta.validation.Valid;

@RestController
public class RestAuthenticationController extends RestBaseController implements IRestAuthenticationController{
	
	@Autowired
	private IAuthenticationService authenticationService;
	
	@PostMapping(path = "/register")
	@Override
	public RootEntity<DtoUser> register(@Valid @RequestBody AuthRequest input) {
		return ok(authenticationService.register(input));
	}

	@PostMapping(path = "/authenticate")
	@Override
	public RootEntity<AuthResponse> authenticate(@Valid @RequestBody AuthRequest input) {
		return ok(authenticationService.authenticate(input));
	}
	
	@PostMapping(path = "/refreshToken")
	@Override
	public RootEntity<AuthResponse> refreshToken(@Valid @RequestBody RefreshTokenRequest input) {
		return ok(authenticationService.refreshToken(input));
	}

}
