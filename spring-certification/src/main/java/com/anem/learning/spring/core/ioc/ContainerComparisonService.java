package com.anem.learning.spring.core.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Demonstrates the conceptual difference between BeanFactory and ApplicationContext.
 * BeanFactory is a basic container, while ApplicationContext adds features such as
 * events, resource loading, and internationalization.
 */
@Component
public class ContainerComparisonService {
	private final BeanFactory beanFactory;
	private final ApplicationContext applicationContext;

	public ContainerComparisonService(BeanFactory beanFactory, ApplicationContext applicationContext) {
		this.beanFactory = beanFactory;
		this.applicationContext = applicationContext;
	}

	public String describeContainer() {
		return "BeanFactory=" + beanFactory.getClass().getSimpleName()
				+ ", ApplicationContext=" + applicationContext.getClass().getSimpleName();
	}
}
