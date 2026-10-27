package com.myjavaintroduction;

public class Bank {
	static String bankName;
	long acno;
	int balance;
	String accountHolderName;
	void display()
	{  
		System.out.println("Bank Name:" + bankName);
		System.out.println("Account Number:" + acno);
		System.out.println("Balance:" + balance);
		System.out.println("Account Holder Name:" + accountHolderName);
		
	}
	
	public static void main(String[] args) {
		bankName = "SBI";
		Bank b1 = new Bank();
		b1.acno = 234567896;
		b1.balance = 200000;
		b1.accountHolderName = "ABC";
		b1.display();
		
		Bank b2 = new Bank();
		b2.acno = 967846346;
		b2.balance = 20000;
		b2.accountHolderName = "XYZ";
        b2.display();
        
        Bank b3 = new Bank();
		b3.acno = 986745342;
		b3.balance = 25000;
		b3.accountHolderName = "PQR";
        b3.display();
        
	}

}
