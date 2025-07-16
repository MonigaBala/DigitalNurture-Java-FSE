package com.example.demo.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.JwtUtil;

@RestController
public class AuthenticationController {

	@Autowired
	private JwtUtil jwtUtil;

	@GetMapping("/authenticate")
	public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authHeader) {
		String base64Credentials = authHeader.substring("Basic ".length()).trim();
		byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
		String credentials = new String(credDecoded);
		String[] values = credentials.split(":", 2);

		String username = values[0];
		String password = values[1];

		if ("user".equals(username) && "pwd".equals(password)) {
			String token = jwtUtil.generateToken(username);
			return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
		}

		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
	}
}
