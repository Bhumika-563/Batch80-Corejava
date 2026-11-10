package com.languageFundamentalsConstructors;

public class Bike {
	String model;
	String brand;
	double price;
	String color;
	double range;
	int speed;
	
	Bike(){
	
	}
	 
	public Bike(String model) {
		
	}
	
	public Bike(String model, String brand) {
		
	}
	
	public Bike(String model, String brand, double price) {
		this();
	}
	
	public Bike(String model, String brand, double price, String color) {
		this();
	}
	
	public Bike(String model, String brand, double price, String color, double range) {
		this();
	}

	public Bike(String model, String brand, double price, String color, double range, int speed) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.range = range;
		this.speed = speed;
	}

	public static void main(String[] args) {
		Bike b = new Bike();

	}

}
