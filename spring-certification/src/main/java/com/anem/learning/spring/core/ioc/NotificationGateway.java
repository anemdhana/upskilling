package com.anem.learning.spring.core.ioc;

/**
 * Abstraction for sending notifications.
 */
public interface NotificationGateway {
	void send(String destination, String message);
}
