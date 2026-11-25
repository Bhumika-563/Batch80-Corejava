package com.logicalstatement.loops;

public class TestDemo2 {

	public static void main(String[] args) {
		int i=0;
		int x=0;
		for(;i<=5;) {
			x+=i--;
			x+=--i;
		}
		System.out.println(--x);

	}

}
