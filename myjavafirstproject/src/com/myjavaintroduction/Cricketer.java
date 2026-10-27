package com.myjavaintroduction;

public class Cricketer {

	static String boardName;
	static String countryName;
	int jerseyno;
	String cricketerName;
	int highestScore;

	public static void main(String[] args) {
		boardName = "BCCI";
		countryName = "India";
		System.out.println("boardName:" + boardName);
		System.out.println("countryName:" + countryName);

		boardName = "SLC";
		countryName = "Sri Lanka";
		System.out.println("boardName:" + boardName);
		System.out.println("countryName:" + countryName);
		// object 1

		Cricketer msd = new Cricketer();
		msd.jerseyno = 7;
		msd.cricketerName = "MS Dhoni";
		msd.highestScore = 100;
		System.out.println("jerseyno:" + msd.jerseyno);
		System.out.println("cricketerName:" + msd.cricketerName);
		System.out.println("highestScore:" + msd.highestScore);

		// object 2

		Cricketer ms = new Cricketer();
		ms.jerseyno = 18;
		ms.cricketerName = "Virat";
		ms.highestScore = 100;
		System.out.println("jerseyno:" + ms.jerseyno);
		System.out.println("cricketerName:" + ms.cricketerName);
		System.out.println("highestScore:" + ms.highestScore);

		// object 3

		Cricketer m = new Cricketer();
		m.jerseyno = 45;
		m.cricketerName = "Rohit";
		m.highestScore = 100;
		System.out.println("jerseyno:" + m.jerseyno);
		System.out.println("cricketerName:" + m.cricketerName);
		System.out.println("highestScore:" + m.highestScore);

		// object 4

		Cricketer crt = new Cricketer();
		crt.jerseyno = 1;
		crt.cricketerName = "Rahul";
		crt.highestScore = 100;
		System.out.println("jerseyno:" + crt.jerseyno);
		System.out.println("cricketerName:" + crt.cricketerName);
		System.out.println("highestScore:" + crt.highestScore);
	}

}
