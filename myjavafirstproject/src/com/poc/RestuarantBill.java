package com.poc;

import java.util.Scanner;

public class RestuarantBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalVegCost = 0;
		double totalNonVegCost = 0;
		
		double totalDrinksCost = 0;
		double totalDessertsCost = 0;
		
		double totalStartersCost = 0;
		double totalBill = 0;
		String yn = " ";
		do {
			System.out.println("Enter categories:");
			System.out.println("veg/non_veg/drinks/desserts/starters");
			String category = sc.next();

			switch (category) {
			case "veg" -> {
				String vyn = "";
				do {
					System.out.println("Enter your Item:");
					System.out.println("vb/pv/mb/pb/gopi");

					String items = sc.next();
					switch (items) {
					case "vb" -> {
						System.out.println("Veg Biryani");
						double vbCost = 350;
						System.out.println("Veg Biryani Cost:" + vbCost);
						totalVegCost = totalVegCost + vbCost;
					}

					case "pv" -> {
						System.out.println("Paneer Biryani");
						double pvCost = 250;
						System.out.println("Paneer Biryani Cost:" + pvCost);
						totalVegCost = totalVegCost + pvCost;
					}

					case "mb" -> {
						System.out.println("Mushroom Biryani");
						double mbCost = 220;
						System.out.println("Mushroom Biryani Cost:" + mbCost);
						totalVegCost = totalVegCost + mbCost;
					}

					case "pb" -> {
						System.out.println("Paneer Butter Masala");
						double pbCost = 200;
						System.out.println("Paneer Butter Masala Cost:" + pbCost);
						totalVegCost = totalVegCost + pbCost;
					}

					case "gobi" -> {
						System.out.println("Gobi Manchurian");
						double gobiCost = 150;
						System.out.println("Gobi Manchurian Cost:" + gobiCost);
						totalVegCost = totalVegCost + gobiCost;
					}

					case "vp" -> {
						System.out.println("Veg Pulao");
						double vpCost = 180;
						System.out.println("Veg Pulao Cost:" + vpCost);
						totalVegCost = totalVegCost + vpCost;
					}

					case "fp" -> {
						System.out.println("Fried Rice");
						double fpCost = 160;
						System.out.println("Fried Rice Cost:" + fpCost);
						totalVegCost = totalVegCost + fpCost;
					}

					case "vd" -> {
						System.out.println("Veg Dum Biryani");
						double vdCost = 230;
						System.out.println("Veg Dum Biryani Cost:" + vdCost);
						totalVegCost = totalVegCost + vdCost;
					}

					case "pp" -> {
						System.out.println("Palak Paneer");
						double ppCost = 210;
						System.out.println("Palak Paneer Cost:" + ppCost);
						totalVegCost = totalVegCost + ppCost;
					}
					default -> System.out.println("Invalid Veg Item");
					}
					System.out.println("Total Veg Cos:" + totalVegCost);
					System.out.println(
							"click do you want Continue Next Item for  Y for Yes and Next Category for N for No:");
					vyn = sc.next();

				} while (vyn.equalsIgnoreCase("y"));
			}

			case "non_veg" -> {
				String nvyn = "";
				do {
					System.out.println("Enter your Item:");
					String items = sc.next();
					switch (items) {
					case "cvb" -> {
						System.out.println("Chicken Veg Biryani");
						double cvbCost = 450;
						System.out.println("Chicken Veg Biryani Cost:" + cvbCost);
						totalNonVegCost = totalNonVegCost + cvbCost;
					}

					case "cb" -> {
						System.out.println("Chicken Biryani");
						double cbCost = 250;
						System.out.println("Chicken Biryani Cost:" + cbCost);
						totalNonVegCost = totalNonVegCost + cbCost;
					}

					case "mb" -> {
						System.out.println("Mutton Biryani");
						double mbCost = 350;
						System.out.println("Mutton Biryani Cost:" + mbCost);
						totalNonVegCost = totalNonVegCost + mbCost;
					}

					case "fb" -> {
						System.out.println("Fish Biryani");
						double fbCost = 300;
						System.out.println("Fish Biryani Cost:" + fbCost);
						totalNonVegCost = totalNonVegCost + fbCost;
					}

					case "ep" -> {
						System.out.println("Egg Pulao");
						double epCost = 180;
						System.out.println("Egg Pulao Cost:" + epCost);
						totalNonVegCost = totalNonVegCost + epCost;
					}

					case "cf" -> {
						System.out.println("Chicken Fry");
						double cfCost = 220;
						System.out.println("Chicken Fry Cost:" + cfCost);
						totalNonVegCost = totalNonVegCost + cfCost;
					}

					case "65" -> {
						System.out.println("Chicken 65");
						double c65Cost = 200;
						System.out.println("Chicken 65 Cost:" + c65Cost);
						totalNonVegCost = totalNonVegCost + c65Cost;
					}

					case "cp" -> {
						System.out.println("Chicken Pakoda");
						double cpCost = 190;
						System.out.println("Chicken Pakoda Cost:" + cpCost);
						totalNonVegCost = totalNonVegCost + cpCost;
					}

					case "eggb" -> {
						System.out.println("Egg Biryani");
						double eggbCost = 200;
						System.out.println("Egg Biryani Cost:" + eggbCost);
						totalNonVegCost = totalNonVegCost + eggbCost;
					}

					case "prawnb" -> {
						System.out.println("Prawn Biryani");
						double prawnbCost = 400;
						System.out.println("Prawn Biryani Cost:" + prawnbCost);
						totalNonVegCost = totalNonVegCost + prawnbCost;
					}

					case "mc" -> {
						System.out.println("Mutton Curry");
						double mcCost = 320;
						System.out.println("Mutton Curry Cost:" + mcCost);
						totalNonVegCost = totalNonVegCost + mcCost;
					}

					case "fishf" -> {
						System.out.println("Fish Fry");
						double fishfCost = 280;
						System.out.println("Fish Fry Cost:" + fishfCost);
						totalNonVegCost = totalNonVegCost + fishfCost;
					}
					default -> System.out.println("Invalid Non_Veg Item");
					}

					System.out.println("Total Non Veg Cos:" + totalNonVegCost);
					System.out.println(
							"click do you want Continue for Next Item for Y for Yes and Next Category for N for No:");
					nvyn = sc.next();

				} while (nvyn.equalsIgnoreCase("y"));
			}
			case "drinks" -> {
				String dyn = "";
				do {
					System.out.println("Enter your Item:");
					String items = sc.next();
					switch (items) {
					case "coke" -> {
						System.out.println("Coca Cola");
						double cokeCost = 50;
						System.out.println("Coca Cola Cost:" + cokeCost);
						totalDrinksCost = totalDrinksCost + cokeCost;
					}

					case "pepsi" -> {
						System.out.println("Pepsi");
						double pepsiCost = 50;
						System.out.println("Pepsi Cost:" + pepsiCost);
						totalDrinksCost = totalDrinksCost + pepsiCost;
					}

					case "sprite" -> {
						System.out.println("Sprite");
						double spriteCost = 40;
						System.out.println("Sprite Cost:" + spriteCost);
						totalDrinksCost = totalDrinksCost + spriteCost;
					}

					case "fanta" -> {
						System.out.println("Fanta");
						double fantaCost = 40;
						System.out.println("Fanta Cost:" + fantaCost);
						totalDrinksCost = totalDrinksCost + fantaCost;
					}

					case "ma" -> {
						System.out.println("Mango Juice");
						double maCost = 80;
						System.out.println("Mango Juice Cost:" + maCost);
						totalDrinksCost = totalDrinksCost + maCost;
					}

					case "or" -> {
						System.out.println("Orange Juice");
						double orCost = 70;
						System.out.println("Orange Juice Cost:" + orCost);
						totalDrinksCost = totalDrinksCost + orCost;
					}

					case "lemon" -> {
						System.out.println("Lemon Juice");
						double lemonCost = 40;
						System.out.println("Lemon Juice Cost:" + lemonCost);
						totalDrinksCost = totalDrinksCost + lemonCost;
					}

					case "cof" -> {
						System.out.println("Cold Coffee");
						double cofCost = 100;
						System.out.println("Cold Coffee Cost:" + cofCost);
						totalDrinksCost = totalDrinksCost + cofCost;
					}

					case "mi" -> {
						System.out.println("Milk Shake");
						double miCost = 90;
						System.out.println("Milk Shake Cost:" + miCost);
						totalDrinksCost = totalDrinksCost + miCost;
					}

					case "wa" -> {
						System.out.println("Water Bottle");
						double waCost = 20;
						System.out.println("Water Bottle Cost:" + waCost);
						totalDrinksCost = totalDrinksCost + waCost;
					}
					default -> System.out.println("Invalid Drinks Item");
					}

					System.out.println("Total Non Veg Cos:" + totalDrinksCost);
					System.out.println("click do you want Continue for Next Item for Y for Yes and Next Category for N for No:");
					dyn = sc.next();

				} while (dyn.equalsIgnoreCase("y"));
			}
			case "desserts" -> {
				String deyn = " ";
				do {
					System.out.println("Enter your Item:");
					String items = sc.next();
					switch (items) {
					case "ic" -> {
						System.out.println("Ice Cream");
						double icCost = 80;
						System.out.println("Ice Cream Cost:" + icCost);
						totalDessertsCost = totalDessertsCost + icCost;
					}

					case "gc" -> {
						System.out.println("Gulab Jamun");
						double gcCost = 60;
						System.out.println("Gulab Jamun Cost:" + gcCost);
						totalDessertsCost = totalDessertsCost + gcCost;
					}

					case "br" -> {
						System.out.println("Brownie");
						double brCost = 100;
						System.out.println("Brownie Cost:" + brCost);
						totalDessertsCost = totalDessertsCost + brCost;
					}

					case "kc" -> {
						System.out.println("Kaju Katli");
						double kcCost = 120;
						System.out.println("Kaju Katli Cost:" + kcCost);
						totalDessertsCost = totalDessertsCost + kcCost;
					}

					case "ra" -> {
						System.out.println("Rasmalai");
						double raCost = 90;
						System.out.println("Rasmalai Cost:" + raCost);
						totalDessertsCost = totalDessertsCost + raCost;
					}

					case "cp" -> {
						System.out.println("Chocolate Pastry");
						double cpCost = 100;
						System.out.println("Chocolate Pastry Cost:" + cpCost);
						totalDessertsCost = totalDessertsCost + cpCost;
					}

					case "kcake" -> {
						System.out.println("Chocolate Cake");
						double kcakeCost = 150;
						System.out.println("Chocolate Cake Cost:" + kcakeCost);
						totalDessertsCost = totalDessertsCost + kcakeCost;
					}

					case "kd" -> {
						System.out.println("Kulfi");
						double kdCost = 50;
						System.out.println("Kulfi Cost:" + kdCost);
						totalDessertsCost = totalDessertsCost + kdCost;
					}

					case "ja" -> {
						System.out.println("Jalebi");
						double jaCost = 50;
						System.out.println("Jalebi Cost:" + jaCost);
						totalDessertsCost = totalDessertsCost + jaCost;
					}

					case "ph" -> {
						System.out.println("Phirni");
						double phCost = 80;
						System.out.println("Phirni Cost:" + phCost);
						totalDessertsCost = totalDessertsCost + phCost;
					}
					default -> System.out.println("Invalid Desserts Item");
					}

					System.out.println("Total Non Veg Cos:" + totalDessertsCost);
					System.out.println(
							"click do you want Continue for Next Item for Y for Yes and Next Category for N for No:");
					deyn = sc.next();

				} while (deyn.equalsIgnoreCase("y"));
			}
			case "starters" -> {
				String syn = " ";
				do {
					System.out.println("Enter your Item:");
					String items = sc.next();
					switch (items) {
					case "pt" -> {
						System.out.println("Paneer Tikka");
						double ptCost = 180;
						System.out.println("Paneer Tikka Cost:" + ptCost);
						totalStartersCost = totalStartersCost + ptCost;
					}

					case "gm" -> {
						System.out.println("Gobi Manchurian");
						double gmCost = 150;
						System.out.println("Gobi Manchurian Cost:" + gmCost);
						totalStartersCost = totalStartersCost + gmCost;
					}

					case "bc" -> {
						System.out.println("Baby Corn Fry");
						double bcCost = 160;
						System.out.println("Baby Corn Fry Cost:" + bcCost);
						totalStartersCost = totalStartersCost + bcCost;
					}

					case "vf" -> {
						System.out.println("Veg Spring Rolls");
						double vfCost = 140;
						System.out.println("Veg Spring Rolls Cost:" + vfCost);
						totalStartersCost = totalStartersCost + vfCost;
					}

					case "cfry" -> {
						System.out.println("Chicken Fry");
						double cfryCost = 220;
						System.out.println("Chicken Fry Cost:" + cfryCost);
						totalStartersCost = totalStartersCost + cfryCost;
					}

					case "cl" -> {
						System.out.println("Chicken Lollipop");
						double clCost = 250;
						System.out.println("Chicken Lollipop Cost:" + clCost);
						totalStartersCost = totalStartersCost + clCost;
					}

					case "ct" -> {
						System.out.println("Chicken Tikka");
						double ctCost = 280;
						System.out.println("Chicken Tikka Cost:" + ctCost);
						totalStartersCost = totalStartersCost + ctCost;
					}

					case "c65" -> {
						System.out.println("Chicken 65");
						double c65Cost = 220;
						System.out.println("Chicken 65 Cost:" + c65Cost);
						totalStartersCost = totalStartersCost + c65Cost;
					}

					case "mf" -> {
						System.out.println("Mushroom Fry");
						double mfCost = 170;
						System.out.println("Mushroom Fry Cost:" + mfCost);
						totalStartersCost = totalStartersCost + mfCost;
					}

					case "pf" -> {
						System.out.println("Prawn Fry");
						double pfCost = 300;
						System.out.println("Prawn Fry Cost:" + pfCost);
						totalStartersCost = totalStartersCost + pfCost;
					}
					default -> System.out.println("Invalid Starters Item");
					}

					System.out.println("Total Non Veg Cos:" + totalStartersCost);
					System.out.println(
							"click do you want Continue for Next Item for Y for Yes and Next Category for N for No:");
					syn = sc.next();

				} while (syn.equalsIgnoreCase("y"));
			}
			default -> System.out.println("Invalid category");

			}
			System.out.println("Do You Want Continue Next Category y for yes n for no:");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		totalBill = totalVegCost + totalNonVegCost + totalDrinksCost + totalDessertsCost + totalStartersCost;
		System.out.println("Total Bill:" + totalBill);

	}

}

