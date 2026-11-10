/*1.Write a Java program to implement constructor chaining using both this() and super() 
by creating a parent class Vehicle with fields brand and model, 
and a child class Car with additional fields fuelType and price. 
Initialize the fields using constructors and display all vehicle details.*/
package com.languageFundamentalsConstructors;
import java.util.Scanner;
class Vehicle1{
	Scanner sc = new Scanner(System.in);
     String model;
     String brand;
     Vehicle1(String model,String brand){
        this.model=model;
        this.brand=brand;
     }
}
public class Auto extends Vehicle1 {
       String fuelType;
       double price;
      
       Auto(String fuelType,double price){
    	   Scanner sc = new Scanner(System.in);
           System.out.println("Enter Model Name:");
           String model =sc.next();
           System.out.println("Enter Brand Name:");
           sc.nextLine();
           String brand =sc.nextLine();
       	   super(model,brand);
    	   this.fuelType=fuelType;
    	   this.price=price;   
       }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fuel Type Name:");
        String fuelType=sc.nextLine();
        System.out.println("Enter Price:");
        double price=sc.nextDouble();
        Auto a = new Auto(fuelType,price);
        a.vehicleInfo();
      
	}
	void vehicleInfo(){
		System.out.println("Model of the Vehicle:" +model);
		System.out.println("Brand of the Vehicle:" +brand);
		System.out.println("Fuel Type of the Vehicle:" +fuelType);
		System.out.println("Price of the Vechicle:" +price);
		System.out.println("****************************************");
	}

}
