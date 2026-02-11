package com.anem.learning.spring.core.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Email-based notification gateway implementation.
 */
@Component
public class EmailNotificationGateway implements NotificationGateway {
	private static final Logger logger = LoggerFactory.getLogger(EmailNotificationGateway.class);

	@Override
	public void send(String destination, String message) {
		logger.info("Email to {}: {}", destination, message);
	}
}
