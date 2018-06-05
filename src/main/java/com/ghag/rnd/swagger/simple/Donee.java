package com.ghag.rnd.swagger.simple;

public class Donee {
	
	private String vendorCode;
	
	private String vendorName;
	
	private String name;
	
	private String pan;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String pincode;
	
	private double eligibleRate;
	
	private String status;

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public double getEligibleRate() {
		return eligibleRate;
	}

	public void setEligibleRate(double eligibleRate) {
		this.eligibleRate = eligibleRate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Donee [vendorCode=" + vendorCode + ", vendorName=" + vendorName + ", name=" + name + ", pan=" + pan
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", eligibleRate=" + eligibleRate + ", status=" + status + "]";
	}
	
	
	

}
