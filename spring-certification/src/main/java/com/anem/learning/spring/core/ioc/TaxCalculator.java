package com.anem.learning.spring.core.ioc;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

/**
 * Calculates sales tax for demonstration purposes.
 */
@Component
public class TaxCalculator {
	public BigDecimal calculate(BigDecimal subtotal) {
		return subtotal.multiply(new BigDecimal("0.08"));
	}
}
