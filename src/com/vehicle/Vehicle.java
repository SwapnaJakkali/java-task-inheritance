package com.vehicle;

public class Vehicle {
	String ownerName;
	String vehicleName;
	String vehicleType;
	
	public Vehicle() {
		
	}
	public Vehicle(String on, String vn, String vt) {
		this.ownerName=on;
		this.vehicleName=vn;
		this.vehicleType=vt;
		
		System.out.println("vehicle profile has been created from parent.");
		
	}
}
