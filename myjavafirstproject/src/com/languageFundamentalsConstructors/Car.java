package com.languageFundamentalsConstructors;

public class Car {
	String model;
	String brand;
	double price;
	String color;

	Car() {
		System.out.println("No-arg Constructor:");
		this("unknown");
	}

	public Car(String model) {
		this(model, "unknown");
	}

	public Car(String model, String brand) {
		this(model, brand, 100000.00);
	}

	public Car(String model, String brand, double price) {
		this(model, brand, price, "unknown");
	}

	public Car(String model, String brand, double price, String color) {
        this.model=model;
        this.brand=brand;
        this.price=price;
        this.color=color;
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.carInfo();
		Car c1 = new Car("BMW");
		c1.carInfo();
		Car c2 = new Car("ABC", "XYZ");
		c2.carInfo();
		Car c3 = new Car("Deepika", "Deepika", 150000.00);
		c3.carInfo();
		Car c4 = new Car("OCR", "KNB", 200000.00, "Black");
		c4.carInfo();

	}

	void carInfo() {
		System.out.println("Model of the:" + model);
		System.out.println("Brand of the:" + brand);
		System.out.println("Price of the:" + price);
		System.out.println("Color of the:" + color);

	}

}
