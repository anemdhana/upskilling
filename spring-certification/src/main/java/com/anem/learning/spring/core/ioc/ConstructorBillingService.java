package com.anem.learning.spring.core.ioc;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

/**
 * Demonstrates constructor-based dependency injection with an immutable dependency.
 */
@Service
public class ConstructorBillingService {
	private final TaxCalculator taxCalculator;

	public ConstructorBillingService(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}

	public BigDecimal totalWithTax(BigDecimal subtotal) {
		return subtotal.add(taxCalculator.calculate(subtotal));
	}
}
