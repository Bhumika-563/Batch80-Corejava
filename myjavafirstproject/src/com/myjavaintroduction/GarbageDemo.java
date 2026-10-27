// 14-10-2026
package com.myjavaintroduction;

public class GarbageDemo {
	
	@Override
	protected void finalize()  {
		
		System.out.println("Finalize Mathod called by Garbage Collector");
	}
	
	void demo() {
	    GarbageDemo g = new GarbageDemo();
		System.out.println("DEMO");
	}

	public static void main(String[] args) {
		GarbageDemo g = new GarbageDemo();
		System.out.println("Main Method started");
		System.out.println(g);
		
		
		GarbageDemo g1 = new GarbageDemo();
		System.out.println(g1);
		
		GarbageDemo g2 = new GarbageDemo();
		System.out.println(g2);
		
		GarbageDemo g3 = new GarbageDemo();
		System.out.println(g3);
		
		g = null; // Nullifying References
		
		g1 = g2; // Reassigning References
		System.out.println(g1);
		
		g2.demo(); // out of scope
		
		new GarbageDemo().demo(); // Anonymous Objects
		
		System.gc();
		
		System.out.println("Main Method ended");
	}

}
