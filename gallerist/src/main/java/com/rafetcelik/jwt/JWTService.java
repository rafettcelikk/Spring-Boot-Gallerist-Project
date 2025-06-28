package com.rafetcelik.jwt;

import java.security.Key;
import java.util.Date;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {
	
	@Value("${jwt.secret}")
    private String secretKey; 
	
	public String generateToken(UserDetails userDetails) {
		return Jwts.builder()
		.setSubject(userDetails.getUsername())
		.setIssuedAt(new Date())
		.setExpiration(new Date(System.currentTimeMillis() + 1000*60*60*2))
		.signWith(getKey(), SignatureAlgorithm.HS256)
		.compact();
	}
	
	public <T> T exportToken(String token, Function<Claims, T> claimsFunc) {
		Claims claims = getClaims(token);
		return claimsFunc.apply(claims);
	}
	
	public Claims getClaims(String token) {
		Claims claims = Jwts.parserBuilder()
				.setSigningKey(getKey())
				.build()
				.parseClaimsJws(token).getBody();
		return claims;
	}
	
	public String getUsernameByToken(String token) {
		return exportToken(token, Claims::getSubject);
	}
	
	public boolean isTokenValid(String token) {
		Date expiredDate = exportToken(token, Claims::getExpiration);
		return new Date().before(expiredDate);
	}
	
	public Key getKey() {
		byte[] bytes = Decoders.BASE64.decode(secretKey);
		return Keys.hmacShaKeyFor(bytes);
	}
}
