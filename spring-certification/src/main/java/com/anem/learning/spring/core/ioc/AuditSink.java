package com.anem.learning.spring.core.ioc;

/**
 * Optional audit sink interface for demonstrating optional dependencies.
 */
public interface AuditSink {
	void record(String event);
}
