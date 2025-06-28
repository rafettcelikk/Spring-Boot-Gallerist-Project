package com.rafetcelik.service;

import com.rafetcelik.dto.AuthRequest;
import com.rafetcelik.dto.AuthResponse;
import com.rafetcelik.dto.DtoUser;
import com.rafetcelik.dto.RefreshTokenRequest;

public interface IAuthenticationService {
	
	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
