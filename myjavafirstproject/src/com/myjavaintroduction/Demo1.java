package com.myjavaintroduction;

public class Demo1 {
	 {
	    	System.out.println("Instance Block Called3");
	    } 
    static {
    	System.out.println("Static Block Called1");
    
    }
    {
    	System.out.println("Instance Block Called1");
    
    }
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Demo1 d = new Demo1();
		System.out.println("Main Method Ended");
	}
    static {
    	System.out.println("Static Block Called2");
    }
    {
    	System.out.println("Instance Block Called2");
    } 
}
