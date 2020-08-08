package com.UserManagementSystem.api.io.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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
@MappedSuperclass


@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

	@Column(name = "id", updatable = false, insertable = true)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@CreatedBy
	@Column(name = "created_by",  insertable = true)
	private String createdBy;

	@LastModifiedBy
	@Column(name = "last_modified_by",  insertable = true)
	private String lastModifiedBy;

	@CreatedDate
	@Temporal(TemporalType.DATE)
	@Column(name = "created_dt",  insertable = true)
	private Date createdDate;

	@CreatedDate
	@Temporal(TemporalType.DATE)
	@Column(name = "last_modified_dt", insertable = true)
	private Date lastModifiedDate;
	
	@Column(name = "is_active",columnDefinition = "BOOLEAN")
	private boolean isActive = true;
	
	
	
}
