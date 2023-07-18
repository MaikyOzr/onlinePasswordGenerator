package com.roma.demo.service;

import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class WebService {
	 
	public String generatePassword() {
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		String allowedCharString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
				+ "~`!@#$%^&*()-_=+|";
		for (int i = 0; i<=14; i++) {
			char symb = allowedCharString.charAt(random.nextInt(allowedCharString.length()));
			builder.append(symb);
		}
		return builder.toString();
	}
}
