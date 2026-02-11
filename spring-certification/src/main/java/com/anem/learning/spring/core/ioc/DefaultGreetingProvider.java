package com.anem.learning.spring.core.ioc;

import org.springframework.stereotype.Component;

/**
 * Default greeting provider used by multiple DI annotations.
 */
@Component
public class DefaultGreetingProvider implements GreetingProvider {
	@Override
	public String greetingFor(String name) {
		return "Hello, " + name + "!";
	}
}
