package com.anem.learning.spring.core.ioc;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Demonstrates bean lifecycle callbacks: initialization and destruction.
 */
@Component
public class LifecycleTrackedBean {
	private static final Logger logger = LoggerFactory.getLogger(LifecycleTrackedBean.class);

	@PostConstruct
	public void onInit() {
		logger.info("LifecycleTrackedBean initialized");
	}

	@PreDestroy
	public void onDestroy() {
		logger.info("LifecycleTrackedBean destroyed");
	}
}
