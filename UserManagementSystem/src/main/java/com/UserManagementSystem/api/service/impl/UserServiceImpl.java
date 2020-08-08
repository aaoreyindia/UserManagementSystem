package com.UserManagementSystem.api.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserManagementSystem.api.io.entity.UserEntity;
import com.UserManagementSystem.api.model.request.UserRegisterRequestModel;
import com.UserManagementSystem.api.repository.UserRepository;
import com.UserManagementSystem.api.service.UserService;
import com.UserManagementSystem.api.util.AppUtility;


@Service   
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public void registerUser(UserRegisterRequestModel userRegisterRequestModel) {
		
		//{"+91" , "7889011453"}
	
		String userName = AppUtility.concatenateGivenString(userRegisterRequestModel.getFirstName(),
				userRegisterRequestModel.getMobileNumber().split("-")[1], 4, 4);
        
		/**setting extra fields which does not comes in request**/
		fillUserRequestWithExtraFields(userRegisterRequestModel,userName);
		
		/**Creating UserEntity**/
		UserEntity userEntity = new UserEntity();
		
		BeanUtils.copyProperties(userRegisterRequestModel, userEntity);
		
		userRepository.save(userEntity);
		
		
		
		
       
	}
	
	private void fillUserRequestWithExtraFields(UserRegisterRequestModel userRegisterRequestModel,String userName){
		
		userRegisterRequestModel.setUserName(userName);
	/*	userRegisterRequestModel.setActive(true);
		userRegisterRequestModel.setCreatedBy("SYSTEM");
		userRegisterRequestModel.setCreatedDate(new Date());
		userRegisterRequestModel.setLastModiefiedDate(new Date());
		userRegisterRequestModel.setLastModifiedBy("SYSTEM");*/
	}


}
