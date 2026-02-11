package com.anem.learning.spring.core.ioc;

import org.springframework.stereotype.Service;

/**
 * Demonstrates resolving a dependency via @Primary when no qualifier is used.
 */
@Service
public class PrimaryMessageService {
	private final MessageFormatter formatter;

	public PrimaryMessageService(MessageFormatter formatter) {
		this.formatter = formatter;
	}

	public String formatForEmail(String message) {
		return formatter.format(message);
	}
}
