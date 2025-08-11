package com.example.JwtSecurityApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey; // Important for SecretKey type
import java.util.Collections;
import java.util.Date;

@Component
public class JwtTokenProvider {
    @Autowired
    private JwtConfig jwtConfig;
    public String createToken(String username) {
        Claims claims = Jwts.claims().setSubject(username);
        Date now = new Date();
        Date validity = new Date(now.getTime() + 3600000); // 1 hour validity
        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(validity).signWith(SignatureAlgorithm.HS256, jwtConfig.getSecret())
                .compact();
    }
}
