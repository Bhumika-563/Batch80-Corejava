package com.javamethods;

import java.util.Scanner;

public class Shopping {
	Scanner sc = new Scanner(System.in);
	
	double mobileInfo() {
		double totalMobilePrice = 0;
		System.out.println("Enter Mobile Price:");
		double mobilePrice = sc.nextDouble();
		
		System.out.println("Enter Quantity:");
		int qty = sc.nextInt();
		totalMobilePrice = mobilePrice*qty;
		return totalMobilePrice;
	}
	
	double watchInfo() {
		double totalWatchPrice = 0;
		System.out.println("Enter Watch Price:");
		double watchPrice = sc.nextDouble();
		
		System.out.println("Enter Quantity:");
		int qty = sc.nextInt();
		totalWatchPrice = watchPrice*qty;
		return totalWatchPrice;
	}
	public static void main(String[] args) {
		Shopping s = new Shopping();
		double mp = s.mobileInfo();
        double wp = s.watchInfo();
        System.out.println("Total Bill is:"+(mp+wp));
	}

}
