package com.anem.learning.spring.core.ioc;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Uses @Resource for name-based dependency injection.
 */
@Service
public class ResourceGreetingClient {
	@Resource(name = "defaultGreetingProvider")
	private GreetingProvider greetingProvider;

	public String greet(String name) {
		return greetingProvider.greetingFor(name);
	}
}
