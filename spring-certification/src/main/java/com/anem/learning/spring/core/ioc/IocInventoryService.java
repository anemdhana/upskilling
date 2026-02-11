package com.anem.learning.spring.core.ioc;

import org.springframework.stereotype.Service;

/**
 * Demonstrates IoC: the container creates this service and injects the gateway,
 * so the service never instantiates its own dependencies.
 */
@Service
public class IocInventoryService {
	private final IocInventoryGateway inventoryGateway;

	public IocInventoryService(IocInventoryGateway inventoryGateway) {
		this.inventoryGateway = inventoryGateway;
	}

	public boolean reserveItems(String sku, int quantity) {
		return inventoryGateway.reserve(sku, quantity);
	}
}
