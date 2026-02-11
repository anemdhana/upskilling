package com.anem.learning.spring.core.ioc;

/**
 * Gateway used by the IoC container to decouple inventory access from services.
 */
public interface IocInventoryGateway {
	boolean reserve(String sku, int quantity);
}
