package com.anem.learning.spring.core.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Demonstrates setter-based dependency injection.
 */
@Service
public class SetterNotificationService {
	private NotificationGateway notificationGateway;

	@Autowired
	public void setNotificationGateway(NotificationGateway notificationGateway) {
		this.notificationGateway = notificationGateway;
	}

	public void notifyCustomer(String email, String message) {
		notificationGateway.send(email, message);
	}
}
