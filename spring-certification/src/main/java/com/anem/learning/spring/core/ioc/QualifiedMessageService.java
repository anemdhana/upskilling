package com.anem.learning.spring.core.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Demonstrates selecting a specific bean with @Qualifier.
 */
@Service
public class QualifiedMessageService {
	private final MessageFormatter formatter;

	public QualifiedMessageService(@Qualifier("jsonMessageFormatter") MessageFormatter formatter) {
		this.formatter = formatter;
	}

	public String formatForApi(String message) {
		return formatter.format(message);
	}
}
