package com.cognizant.spring_learn.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("Start of /authenticate");
        LOGGER.debug("Authorization Header: {}", authHeader);

        String[] credentials = getCredentials(authHeader);
        String username = credentials[0];
        String password = credentials[1];

        LOGGER.debug("Username: {}", username);
        LOGGER.debug("Password: {}", password);

        // 🔐 Perform Spring authentication
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password));
        LOGGER.info("Authentication successful for user: {}", username);

        Map<String, String> map = new HashMap<>();
        map.put("token", ""); // JWT will be added in the next step
        LOGGER.info("End of /authenticate");
        return map;
    }

    // Extract both username and password from header
    private String[] getCredentials(String authHeader) {
        LOGGER.debug("Inside getCredentials()");
        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);
        LOGGER.debug("Decoded credentials: {}", decodedString);
        return decodedString.split(":", 2);
    }
}
