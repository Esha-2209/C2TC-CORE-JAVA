package com.EshaApplication.Daytwo;

public class Customer {
	//Attributes
	private int Customer_Id;
	private String customerName;
	private String customerCity;
	
	//default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

     //parameterised constructor
	public Customer(int customer_Id, String customerName, String customerCity) {
		super();
		Customer_Id = customer_Id;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}


     //getter and setter
	public int getCustomer_Id() {
		return Customer_Id;
	}


	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	


	@Override
	public String toString() {
		return "Customer [Customer_Id=" + Customer_Id + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}


	public static void main(String[] args) {
	

	}
	

}
