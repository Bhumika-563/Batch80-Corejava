package com.logicalstatement.loops;

import java.util.Scanner;

public class Armstrong {
	
	static int armStrong(int n) {
		int armStrongNum=0;
		int r=0;
		int count=0;
		int n1=n;
		int sumP=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		while(n1>0) {
			r=n1%10;
			n1=n1/10;
			sumP=(int)(sumP+ Math.pow(r,count));
			armStrongNum=sumP;
		}
		return armStrongNum;
	   
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int armStrongNum=armStrong(n);
		 if(n==armStrongNum) {
		    	System.out.println("the Given Number is Armstrong Number");
		    }else {
		    	System.out.println("the Given Number is not  Armstrong Number");
		    }
	}

}
