package com.languageFundamentalsConstructors;
import java.util.Scanner;
public class BankAccount {
	Scanner sc = new Scanner(System.in);
	long accountNumber;
	String accountHolderName;
	double balance;
	
	void deposite() {
		System.out.println("Enter Deposite Amount:");
		double deposite =sc.nextDouble();
		balance = balance+deposite;
		System.out.println("Deposite Money:"+deposite);
		System.out.println("Balance After Deposite:"+balance);
	}
	void withDraw() {
		System.out.println("Enter With Draw Amount:");
		double withdraw =sc.nextDouble();
		balance = balance-withdraw;
		System.out.println("With Draw Money:"+withdraw);
		System.out.println("Balance After WithDraw:"+balance);
	}
	void checkBalance() {
		
		System.out.println("Check Balance:"+balance);
	}
	void dispalyResult() {
		
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Account Holder Name:"+accountHolderName);
		System.out.println("balance:" + balance);
		deposite();
		withDraw();
		checkBalance();
	}
	BankAccount(long accountNumber,String accountHolderName,double balance){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		long accountNumber = sc.nextLong();
		System.out.println("Enter Account Holder Name:");
		String accountHolderName=sc.next();
		System.out.println("Enter Balance:");
		double balance = sc.nextDouble();
		BankAccount ba = new BankAccount(accountNumber,accountHolderName,balance);
		ba.dispalyResult();
	}

}
