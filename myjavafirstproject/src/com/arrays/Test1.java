package com.arrays;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6,7};
		int[] c = new int[a.length+b.length];

		for (int i = 0; i < a.length; i++) {
		    c[i] = a[i] + b[i];
		}

		c[3] = b[3];

		System.out.println(Arrays.toString(c));	
	}

}
