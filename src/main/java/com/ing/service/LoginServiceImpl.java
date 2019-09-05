package com.ing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.LoginReqDto;
import com.ing.dto.LoginResDto;
import com.ing.repository.CustomerRepository;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private CustomerRepository userRepository;
	
	@Override
	public LoginResDto userLogin(LoginReqDto loginDto) {
		return null;
	}
}
