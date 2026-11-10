package com.languageFundamentalsConstructors;
class Product{
	String model;
	String brand;
	double price;
	String color;
	Product(String model,String brand,double price,String color){
		this.model=model;
		this.brand=brand;
		this.price=price;
		this.color=color;
		System.out.println("No arg Constructor called Product");
	}
	Product(String model,String brand){
	    this.model=model;
	    this.brand=brand;
	    System.out.println("Two arg Constructor called Product");
	}
}
public class Mobile extends Product {
       Mobile(){
    	 super("17promax","samsung",120000,"white"); 
    	 System.out.println("No arg Constructor called Customer") ; 
       }
       Mobile(String model,String brand){
    	   super(model,brand);
    	   super.model=model;
    	   super.brand=brand;
    	   System.out.println("Two Arg Constructor Called Customer");
       }
     
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.mobileInfo();
		Mobile m1 = new Mobile("14maxPro","Google");
		m1.mobileInfo();

	}
	void mobileInfo(){
		System.out.println("Model Name of the Mobile:"+model);
		System.out.println("Brand Name of the Mobile:"+brand);
		System.out.println("Price of the Mobile:"+price);
		System.out.println("Color of the Mobile:"+color);
		System.out.println("*******************************************");
	
	}

}
