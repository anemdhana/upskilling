package com.anem.learning.spring.core.ioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

/**
 * Simple in-memory inventory implementation used for IoC demonstrations.
 */
@Component
public class InMemoryInventoryGateway implements IocInventoryGateway {
	private final Map<String, Integer> stock = new ConcurrentHashMap<>();

	public InMemoryInventoryGateway() {
		stock.put("SKU-COFFEE", 10);
		stock.put("SKU-TEA", 20);
	}

	@Override
	public boolean reserve(String sku, int quantity) {
		Integer available = stock.get(sku);
		if (available == null || available < quantity) {
			return false;
		}
		stock.put(sku, available - quantity);
		return true;
	}
}
