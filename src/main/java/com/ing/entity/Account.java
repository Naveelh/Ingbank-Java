package com.ing.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Account {
	@Id
	private String accountNumber;
	private String accountName;
	private String bankName;
	private String accountStatus;

}
