package com.UserManagementSystem.api.constant;

public interface RestMappingConstants {

	String APP_BASE_URI = "/UserManagementSystem/v1/api";
	
	public interface User {
		
		String USER_BASE_URI  = APP_BASE_URI +"/user";
		
		String USER_REGISTER_URI =   "/register";
	}
}


