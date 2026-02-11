package com.anem.learning.spring.core.ioc;

import java.util.UUID;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Prototype-scoped bean: a new instance is created every time it is requested.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeToken {
	private final String id = UUID.randomUUID().toString();

	public String getId() {
		return id;
	}
}
