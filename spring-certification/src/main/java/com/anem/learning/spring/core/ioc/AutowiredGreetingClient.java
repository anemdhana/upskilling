package com.anem.learning.spring.core.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Uses Spring's @Autowired for dependency injection.
 */
@Service
public class AutowiredGreetingClient {
	private final GreetingProvider greetingProvider;

	@Autowired
	public AutowiredGreetingClient(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}

	public String greet(String name) {
		return greetingProvider.greetingFor(name);
	}
}
