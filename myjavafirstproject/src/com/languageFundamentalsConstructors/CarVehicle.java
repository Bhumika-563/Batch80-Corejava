package com.languageFundamentalsConstructors;

class Vehicle{
	String model;
	String brand;
	Vehicle(){
		this("Fortuner","Toyota");
	}
	Vehicle(String model,String brand){
		this.model=model;
		this.brand=brand;
	}
}
public class CarVehicle extends Vehicle{
	String fuelType;
	double price;
	CarVehicle(){
		this("Petrol",12000000);
	}
	CarVehicle(String fuelType,double price){
		this.fuelType=fuelType;
		this.price=price;
	}
	public static void main(String[] args) {
		CarVehicle ch = new CarVehicle();
		ch.vehicleInfo();
	}
	void vehicleInfo() {
		System.out.println("Model of the Vehicle:"+model);
		System.out.println("Brand of the Vehicle:"+brand);
		System.out.println("Fuel Type of the Vehicle:"+fuelType);
		System.out.println("Price of the Vehicle:"+price);
		
	}
}
