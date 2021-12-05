package com.landinves.portal.exception;

public class LandInvesPortalException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public LandInvesPortalException() {
	}

	public LandInvesPortalException(String errMsg) {
		super(errMsg);
	}
}
