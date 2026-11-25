package com.logicalstatement;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = " ";
	do {
		System.out.println("Enter The Customer Type:");
		String custType = sc.next();
		System.out.println("Enter The Customer Type Rate Per Unit:");
		int unit = sc.nextInt();
		double charges = 0;
		double total_bill = 0;
		switch(custType){
		case "Domestic"->{
			int domestic = 5;
			charges= charges+unit*domestic;
			total_bill = total_bill+charges;
			System.out.println("Total Bill for Domestic Customer:"+total_bill);		
		}
		case "Commercial"->{
			int commercial = 8;
			charges= charges+unit*commercial;
			total_bill = total_bill+charges;
			System.out.println("Total Bill for Commercial Customer:"+total_bill);		
		}
		case "Industrial"->{
			int industrial = 10;
			charges= charges+unit*industrial;
			total_bill = total_bill+charges;
			System.out.println("Total Bill for Industrial Customer:"+total_bill);		
		}
		default -> System.out.println("Invalid Customer");
		}System.out.println("click do you want repeat the code Y for Yes N for No:");
        yn=sc.next();
		
	}while(yn.equalsIgnoreCase("y"));
	}

}
