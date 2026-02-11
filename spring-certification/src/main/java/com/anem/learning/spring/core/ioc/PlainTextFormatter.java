package com.anem.learning.spring.core.ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Primary formatter used when no qualifier is specified.
 */
@Component
@Primary
public class PlainTextFormatter implements MessageFormatter {
	@Override
	public String format(String message) {
		return message;
	}
}
