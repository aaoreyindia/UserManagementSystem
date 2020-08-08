package com.UserManagementSystem.api.model.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRegisterRequestModel {

	/**fields which comes in request**/
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String state;
	private String country;
	

	/**extra fields which do no comes in request . So there values will be null**/
/*	private String createdBy;

	private Date createdDate;

	private String lastModifiedBy;

	private Date lastModiefiedDate;

	private boolean isActive;*/
	
	private String userName;
	
	

}
