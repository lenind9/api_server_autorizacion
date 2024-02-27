package com.uce.edu.demo.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {

	@Value("${app.jwtSemilla}")
	private String jwtSemilla;

	@Value("${app.jwtExpirationMs}")
	private int jwtExpirationMs;

	public String buildTokenJWT(String nombre) {
		return Jwts.builder().setSubject(nombre).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + this.jwtExpirationMs))
				.signWith(SignatureAlgorithm.HS512,
						"ASaskdjhakdhkahdksadhasdasd6a5ds45sad5ad45as4da4d231as5d46sasddasaa54d6as5d4a65d4a65sd4a65d46a5d456ad46ad4a65d456")
				.compact();
	}
}
