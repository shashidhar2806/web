package com.landinves.portal.service;

import com.landinves.portal.exception.LandInvesPortalException;
import com.landinves.portal.vo.CustomerLoginResponse;
import com.landinves.portal.vo.CustomerVO;

public interface LoginService {
	
	/**
	 * @param customerVO
	 * @return
	 */
	public CustomerLoginResponse login(CustomerVO customerVO) throws LandInvesPortalException;
}
