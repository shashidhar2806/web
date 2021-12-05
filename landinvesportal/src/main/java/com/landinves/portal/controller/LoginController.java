package com.landinves.portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.landinves.portal.service.LoginService;
import com.landinves.portal.vo.CustomerLoginResponse;
import com.landinves.portal.vo.CustomerVO;
import static com.landinves.portal.constants.LIPConstants.LOGGER_METHOD_STARTED_ARGS;
import static com.landinves.portal.constants.LIPConstants.LOGGER_METHOD_ENDED;
import static com.landinves.portal.constants.LIPConstants.ERROR_MSG;

@RestController
@RequestMapping
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public ResponseEntity<CustomerLoginResponse> login(@RequestBody CustomerVO customerVO) {
		logger.info(LOGGER_METHOD_STARTED_ARGS, Thread.currentThread().getStackTrace()[1].getMethodName(),
				customerVO.getPhoneNumber());
		CustomerLoginResponse customerLoginResponse = null;
		HttpStatus status = null;
		try {
			/*
			customerLoginResponse = new CustomerLoginResponse();
			customerLoginResponse.setMessage("Success");
			customerLoginResponse.setSuccess(Boolean.TRUE);
		   */
			customerLoginResponse = loginService.login(customerVO);
			status = HttpStatus.OK;
		} catch (Exception ex) {
			logger.error(ERROR_MSG, ex.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
			throw ex;
		}
		
		logger.info(LOGGER_METHOD_ENDED, Thread.currentThread().getStackTrace()[1].getMethodName());
		return new ResponseEntity<CustomerLoginResponse>(customerLoginResponse, status);
	}
}
