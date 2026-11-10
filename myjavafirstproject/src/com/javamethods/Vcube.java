package com.javamethods;

public class Vcube {
	void display(float a){
		
		System.out.println("hello1");		
	}
	void display(double a) {
		System.out.println("hello2");
		
	}
	public static void main(String[] args) {
		Vcube v = new Vcube();
		v.display(10);
	}

}