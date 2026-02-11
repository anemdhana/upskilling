package com.anem.learning.spring.core.ioc;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

/**
 * Part of a circular dependency example. Depends on the validator.
 */
@Service
public class CircularPricingService {
	private final CircularOrderValidator orderValidator;

	public CircularPricingService(CircularOrderValidator orderValidator) {
		this.orderValidator = orderValidator;
	}

	public BigDecimal price(BigDecimal subtotal) {
		orderValidator.validate(subtotal);
		return subtotal.multiply(new BigDecimal("1.05"));
	}
}
