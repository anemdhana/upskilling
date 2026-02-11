package com.anem.learning.spring.core.ioc;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Resolves circular dependency by injecting the pricing service lazily.
 */
@Component
public class CircularOrderValidator {
	private CircularPricingService pricingService;

	@Autowired
	public void setPricingService(@Lazy CircularPricingService pricingService) {
		this.pricingService = pricingService;
	}

	public void validate(BigDecimal subtotal) {
		if (subtotal == null || subtotal.signum() < 0) {
			throw new IllegalArgumentException("Subtotal must be positive");
		}
	}
}
