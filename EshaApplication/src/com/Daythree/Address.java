package com.Daythree;

public class Address {
	
	private String street;
	private String landmark;
	private String city;
	private int Room_no;
	private int pincode;
	
	public Address(String street, String landmark, String city, int room_no, int pincode) {
		super();
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		Room_no = room_no;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRoom_no() {
		return Room_no;
	}

	public void setRoom_no(int room_no) {
		Room_no = room_no;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", landmark=" + landmark + ", city=" + city + ", Room_no=" + Room_no
				+ ", pincode=" + pincode + "]";
	}
	
	
	
	

}
