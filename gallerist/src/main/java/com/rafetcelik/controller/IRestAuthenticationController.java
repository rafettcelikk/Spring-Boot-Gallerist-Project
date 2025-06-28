package com.rafetcelik.controller;

import com.rafetcelik.dto.AuthRequest;
import com.rafetcelik.dto.AuthResponse;
import com.rafetcelik.dto.DtoUser;
import com.rafetcelik.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {
	
	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
