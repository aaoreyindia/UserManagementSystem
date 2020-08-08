package com.UserManagementSystem.api.util;

import com.UserManagementSystem.api.model.response.ResponseData;
import com.UserManagementSystem.api.model.response.ResponseStatus;
import com.UserManagementSystem.api.model.response.UserRegisterResponseModel;

public class ResponseBuilder {

	public  static UserRegisterResponseModel getSuccessResponseForUserRegistration(){
		
		UserRegisterResponseModel userRegisterResponseModel = new UserRegisterResponseModel();
		ResponseStatus responseStatus = new ResponseStatus ();
		responseStatus.setStatusCode(0);
		userRegisterResponseModel.setResponseStatus(responseStatus);
		ResponseData responseData = new ResponseData();
		responseData.setMessage("User Registered Successfully");
		userRegisterResponseModel.setResponseData(responseData);
		
		return userRegisterResponseModel;
	}
}
