package com.landinves.portal.vo;

public class CustomerVO {
	private String phoneNumber;
	private String email;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CustomerVO [phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
}
