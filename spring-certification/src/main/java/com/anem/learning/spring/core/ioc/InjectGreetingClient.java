package com.anem.learning.spring.core.ioc;

import jakarta.inject.Inject;
import org.springframework.stereotype.Service;

/**
 * Uses the standard @Inject annotation for dependency injection.
 */
@Service
public class InjectGreetingClient {
	private final GreetingProvider greetingProvider;

	@Inject
	public InjectGreetingClient(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}

	public String greet(String name) {
		return greetingProvider.greetingFor(name);
	}
}
