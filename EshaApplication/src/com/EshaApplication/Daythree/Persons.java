package com.EshaApplication.Daythree;
// Demo on "HasA" Association
public class Persons {
	private String Name;
	//This is called dependency injection
	private Address address;
	public Persons(String name, Address address) {
		super();
		Name = name;
		this.address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Persons [Name=" + Name + ", address=" + address + "]";
	}
	

}

	