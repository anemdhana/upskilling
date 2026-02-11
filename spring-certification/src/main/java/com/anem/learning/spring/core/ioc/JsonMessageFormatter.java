package com.anem.learning.spring.core.ioc;

import org.springframework.stereotype.Component;

/**
 * JSON formatter selected via @Qualifier.
 */
@Component("jsonMessageFormatter")
public class JsonMessageFormatter implements MessageFormatter {
	@Override
	public String format(String message) {
		return "{\"message\":\"" + message + "\"}";
	}
}
