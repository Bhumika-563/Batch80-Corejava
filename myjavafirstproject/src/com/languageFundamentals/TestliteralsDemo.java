package com.languageFundamentals;

public class TestliteralsDemo {
	String s2 = new String();
	String s3 = new String();

	public static void main(String[] args) {
        
		// Integral literals
		int a = 055;
		int a1 = 0x234;
		int a2 = 0b1100100;
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);

		// floating point literals
		float f = 123;
		float f1 = 0123;
		float f2 = 123.f;
		float f3 = 0123.5f;
		float f4 = 0x123f; //-- octal and hexa not consider
		//float f5 = 0x123.5f;
		// float f6 = 0b1010f;-- compile time error
		float f7 = 0b1010;

		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4 );
		System.out.println(f7);

		// double point literals
		double d = 123;
		double d1 = 0123;
		double d2 = 123d;
		double d3 = 0123.5d;
		double d4 = 0x123d;//-- octal and hexa not consider
		//double d5 = 0x123.5d;
	    //double d6 = 0b1010d;//-- compile time error
		double d7 = 0b1010;

		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d7);
		
		// char literals 
		char c ='A';
		char c1 = 65;// ASCII code
		char c2 = '\u1010';//uni code
		char c3 = '\u1a2b';
		char c4 = 97;//ASCII code
        
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		// null literals
		String st = null;
		String st1 = new String();
		st1 = null;

		// String literals
		String s = "Java";
		String s1 = "Java";

		st = "JFS";
		st1 = "Deepika";

		System.out.println(s == s1);// true
		String s2 = new String("Vcube");
		String s3 = new String("Vcube");
		System.out.println(s2 == s3);
		System.out.println(st);
		System.out.println(st1);

	}
}
