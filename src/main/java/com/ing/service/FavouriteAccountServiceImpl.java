package com.ing.service;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ing.dto.AddFavReqDto;
import com.ing.dto.AddFavResDto;
import com.ing.entity.Account;
import com.ing.repository.AccountRepository;
/**
 * 
 * @author Pradeep
 * @param AddFavReqDto
 * @return AddFavResDto
 * method is to add the favourite account
 * 
 */

@Service
public class FavouriteAccountServiceImpl implements FavouriteAccountService{
	private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
	private AccountRepository accountRepository;
	@Override
	public AddFavResDto addFavAccount(AddFavReqDto favReqDto) {
		Account account =new Account();
		BeanUtils.copyProperties(favReqDto, account);
		account.setAccountStatus("ACTIVE");
		account.setCreatedOn(LocalDate.now());
		accountRepository.save(account);
		logger.info("addFavAccount()  {}", account.getCustomerId());
		AddFavResDto resDto=new AddFavResDto();
		resDto.setMessage("Account  Successfull");
		resDto.setStatus("SUCCESS");
		resDto.setStatusCode(HttpStatus.CREATED.value());
		
		return resDto;
	}
	

}
