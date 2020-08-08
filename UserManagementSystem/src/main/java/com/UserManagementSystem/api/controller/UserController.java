package com.UserManagementSystem.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserManagementSystem.api.constant.RestMappingConstants;
import com.UserManagementSystem.api.model.request.UserRegisterRequestModel;
import com.UserManagementSystem.api.model.response.UserRegisterResponseModel;
import com.UserManagementSystem.api.service.UserService;
import com.UserManagementSystem.api.util.ResponseBuilder;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/** http://localhost:8080
 * 
 * /UserManagementSystem/v1/api/user/register**/


@RestController
@RequestMapping(path = RestMappingConstants.User.USER_BASE_URI)
public class UserController {

	@Autowired
	private UserService userService;
	
	@ApiOperation(

	value = "To Register a User",

	notes = "To Register a User",

	response = UserRegisterResponseModel.class

	)

	@ApiResponses({

			@ApiResponse(code = 202, message = "User Registered Successfully")

	})
	@PostMapping(path = RestMappingConstants.User.USER_REGISTER_URI)
	public ResponseEntity<UserRegisterResponseModel> registerUserHandler(
			@RequestBody UserRegisterRequestModel userRegisterRequestModel) {

		userService.registerUser(userRegisterRequestModel);

		return new ResponseEntity<UserRegisterResponseModel>(ResponseBuilder.getSuccessResponseForUserRegistration(),
				HttpStatus.ACCEPTED);
	}
	
	
}
