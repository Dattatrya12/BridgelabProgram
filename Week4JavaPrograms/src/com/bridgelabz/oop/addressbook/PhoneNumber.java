package com.bridgelabz.oop.addressbook;

public class PhoneNumber 
{
	String mobileNumber;
	Long landlineNumber;
	@Override
	public String toString() {
		return "PhoneNumber [mobileNumber=" + mobileNumber + ", landlineNumber=" + landlineNumber + "]";
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String phoneNumber) {
		this.mobileNumber = phoneNumber;
	}
	public Long getLandlineNumber() {
		return landlineNumber;
	}
	public void setLandlineNumber(Long landlineNumber) {
		this.landlineNumber = landlineNumber;
	}
}
