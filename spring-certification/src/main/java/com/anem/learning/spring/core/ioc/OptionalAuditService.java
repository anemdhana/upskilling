package com.anem.learning.spring.core.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Demonstrates optional dependencies using @Autowired(required = false).
 */
@Service
public class OptionalAuditService {
	private AuditSink auditSink;

	@Autowired(required = false)
	public void setAuditSink(AuditSink auditSink) {
		this.auditSink = auditSink;
	}

	public void recordIfAvailable(String event) {
		if (auditSink != null) {
			auditSink.record(event);
		}
	}
}
