package com.UserManagementSystem.api.config.audit;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditAwareImpl implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		
		String userName  = "SYSTEM";
		
		return Optional.of(userName);
	}

}
