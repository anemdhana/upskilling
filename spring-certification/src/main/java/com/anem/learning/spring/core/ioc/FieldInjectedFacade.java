package com.anem.learning.spring.core.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Demonstrates field injection. This works, but constructor injection is preferred
 * for testability and immutability.
 */
@Service
public class FieldInjectedFacade {
	@Autowired
	private NotificationGateway notificationGateway;

	public void sendAlert(String destination, String message) {
		notificationGateway.send(destination, message);
	}
}
