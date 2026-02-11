package com.anem.learning.spring.core.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Shows singleton vs prototype scope access by requesting prototype beans
 * from the application context.
 */
@Service
public class ScopeShowcaseService {
	private final ApplicationContext applicationContext;
	private final LifecycleTrackedBean lifecycleTrackedBean;

	public ScopeShowcaseService(ApplicationContext applicationContext, LifecycleTrackedBean lifecycleTrackedBean) {
		this.applicationContext = applicationContext;
		this.lifecycleTrackedBean = lifecycleTrackedBean;
	}

	public String compareScopes() {
		PrototypeToken first = applicationContext.getBean(PrototypeToken.class);
		PrototypeToken second = applicationContext.getBean(PrototypeToken.class);
		return "singleton=" + lifecycleTrackedBean.hashCode() + ", prototype=" + first.getId() + "/" + second.getId();
	}
}
