// 15-10-2026
//isolated
package com.myjavaintroduction;

class A {
	B b;

	@Override
	protected void finalize() {
		System.out.println("Finalize Mathod called by Garbage Collector");
	}
}

class B {
	A a;

	@Override
	protected void finalize() {
		System.out.println("Finalize Mathod called by Garbage Collector");
	}
}

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		A a1 = new A();
		B b1 = new B();

		a1.b = b1;
		b1.a = a1;

		a1 = null;
		b1 = null;

		System.gc();

		System.out.println("Main Method ended");
	}

}
