package com.landinves.portal.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.landinves.portal.controller.LoginController;
import com.landinves.portal.exception.LandInvesPortalException;
import com.landinves.portal.service.LoginService;
import com.landinves.portal.vo.CustomerLoginResponse;
import com.landinves.portal.vo.CustomerVO;
import static com.landinves.portal.constants.LIPConstants.LOGGER_METHOD_STARTED;


@Service
public class LoginServiceImpl implements LoginService {
	Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Override
	public CustomerLoginResponse login(CustomerVO customerVO) throws LandInvesPortalException {
		logger.info(LOGGER_METHOD_STARTED, Thread.currentThread().getStackTrace()[1].getMethodName());
		//TODO for Business logic
		//testing phase
		if(customerVO != null) {
			throw new  LandInvesPortalException("Login Failed...");
		}
		return null;
	}


}
