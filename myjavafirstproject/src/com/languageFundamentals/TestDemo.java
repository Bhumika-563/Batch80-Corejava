package com.languageFundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

class Dog {
	   String name;
	Dog(String name){
		this.name = name;
	}
}
public class TestDemo {
	String s = "Java is Simple";
	StringBuffer sb = new StringBuffer("Vcube");
	StringBuilder sb1 = new StringBuilder("Deepika");
	
	BigInteger b = new BigInteger("100");
	BigInteger b1 = new BigInteger("100");
	BigDecimal bd = new BigDecimal("100.00");
	BigDecimal bd1 = new BigDecimal("100.00");
	
	Integer i = 100;
	Character c = 'A';
	Boolean boo = false;
	Dog d = new Dog("Puppy");

	public static void main(String[] args) {
		TestDemo t = new TestDemo();
		System.out.println(t.s);
		System.out.println(t.sb);
		System.out.println(t.sb1);
		System.out.println(t.b);
		
		System.out.println(t.b.add(t.b1));
		System.out.println(t.b.multiply(t.b1));
		System.out.println(t.b.subtract(t.b1));
		System.out.println(t.b.divide(t.b1));
		System.out.println(t.b.mod(t.b1));
		
		System.out.println(t.bd);
		System.out.println(t.bd.add(t.bd1));
		System.out.println(t.bd.multiply(t.bd1));
		System.out.println(t.bd.subtract(t.bd1));
		System.out.println(t.bd.divide(t.bd1));
		
		System.out.println(t.i);
		System.out.println(t.c);
		System.out.println(t.boo);
		System.out.println(t.d.name);

	}

}
