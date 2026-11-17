package com.logicalstatement;

import java.util.Scanner;

public class VowelsorConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn="";
		do {
			System.out.println("Enter a Letter:");
			char letter = sc.next().charAt(0);
			if((letter=='a' || letter =='A') || ( letter == 'e' || letter == 'E') 
				|| (letter == 'i' || letter == 'I') || (letter == 'o' || letter == 'O') || (letter == 'u' || letter == 'E')){
				System.out.println("Given Letter is Vowel");
			}else {
				System.out.println("Given Letter is Consonant");
			}System.out.println("click do you want repeat the code Y for Yes N for No:");
            yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));

	}

}
