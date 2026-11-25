package com.poc;
import java.util.Scanner;

public class ShoppingMallBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalElectronicsCost = 0;
        double totalClothingCost = 0;
        double totalFootwearCost = 0;
        double totalGroceriesCost = 0;
        double totalCosmeticsCost = 0;
        double totalAccessoriesCost = 0;
        double totalBill = 0;

        String yn = "";

        do {
            System.out.println("Enter Category:");
            System.out.println("electronics / clothing / footwear / groceries / cosmetics / accessories");

            String category = sc.next();

            switch (category) {

                case "electronics" -> {
                    String eyn = "";

                    do {
                        System.out.println("Enter your Item:");
                        String items = sc.next();

                        switch (items) {

                            case "mobile" -> {
                                double cost = 15000;
                                System.out.println("Mobile Phone");
                                System.out.println("Mobile Cost:" + cost);
                                totalElectronicsCost += cost;
                            }

                            case "laptop" -> {
                                double cost = 45000;
                                System.out.println("Laptop");
                                System.out.println("Laptop Cost:" + cost);
                                totalElectronicsCost += cost;
                            }

                            case "tv" -> {
                                double cost = 30000;
                                System.out.println("LED Television");
                                System.out.println("TV Cost:" + cost);
                                totalElectronicsCost += cost;
                            }

                            case "fridge" -> {
                                double cost = 25000;
                                System.out.println("Refrigerator");
                                System.out.println("Fridge Cost:" + cost);
                                totalElectronicsCost += cost;
                            }

                            case "headphones" -> {
                                double cost = 2000;
                                System.out.println("Headphones");
                                System.out.println("Headphones Cost:" + cost);
                                totalElectronicsCost += cost;
                            }

                            default -> System.out.println("Invalid Electronics Item");
                        }

                        System.out.println("Total Electronics Cost:" + totalElectronicsCost);
                        System.out.println("Continue Next Item? Y for Yes / N for No:");
                        eyn = sc.next();

                    } while (eyn.equalsIgnoreCase("y"));
                }

                case "clothing" -> {
                    String cyn = "";

                    do {
                        System.out.println("Enter your Item:");
                        String items = sc.next();

                        switch (items) {

                            case "shirt" -> {
                                double cost = 800;
                                System.out.println("Men's Shirt");
                                System.out.println("Shirt Cost:" + cost);
                                totalClothingCost += cost;
                            }

                            case "jeans" -> {
                                double cost = 1500;
                                System.out.println("Jeans");
                                System.out.println("Jeans Cost:" + cost);
                                totalClothingCost += cost;
                            }

                            case "saree" -> {
                                double cost = 2500;
                                System.out.println("Saree");
                                System.out.println("Saree Cost:" + cost);
                                totalClothingCost += cost;
                            }

                            case "kurti" -> {
                                double cost = 1000;
                                System.out.println("Kurti");
                                System.out.println("Kurti Cost:" + cost);
                                totalClothingCost += cost;
                            }

                            case "jacket" -> {
                                double cost = 2000;
                                System.out.println("Jacket");
                                System.out.println("Jacket Cost:" + cost);
                                totalClothingCost += cost;
                            }

                            default -> System.out.println("Invalid Clothing Item");
                        }

                        System.out.println("Total Clothing Cost:" + totalClothingCost);
                        System.out.println("Continue Next Item? Y for Yes / N for No:");
                        cyn = sc.next();

                    } while (cyn.equalsIgnoreCase("y"));
                }

                case "footwear" -> {
                    String fyn = "";

                    do {
                        System.out.println("Enter your Item:");
                        String items = sc.next();

                        switch (items) {

                            case "shoes" -> {
                                double cost = 2500;
                                System.out.println("Shoes");
                                System.out.println("Shoes Cost:" + cost);
                                totalFootwearCost += cost;
                            }

                            case "sandals" -> {
                                double cost = 1200;
                                System.out.println("Sandals");
                                System.out.println("Sandals Cost:" + cost);
                                totalFootwearCost += cost;
                            }

                            case "slippers" -> {
                                double cost = 400;
                                System.out.println("Slippers");
                                System.out.println("Slippers Cost:" + cost);
                                totalFootwearCost += cost;
                            }

                            case "heels" -> {
                                double cost = 1800;
                                System.out.println("High Heels");
                                System.out.println("Heels Cost:" + cost);
                                totalFootwearCost += cost;
                            }

                            case "sneakers" -> {
                                double cost = 3000;
                                System.out.println("Sneakers");
                                System.out.println("Sneakers Cost:" + cost);
                                totalFootwearCost += cost;
                            }

                            default -> System.out.println("Invalid Footwear Item");
                        }

                        System.out.println("Total Footwear Cost:" + totalFootwearCost);
                        System.out.println("Continue Next Item? Y for Yes / N for No:");
                        fyn = sc.next();

                    } while (fyn.equalsIgnoreCase("y"));
                }

                case "groceries" -> {
                    String gyn = "";

                    do {
                        System.out.println("Enter your Item:");
                        String items = sc.next();

                        switch (items) {

                            case "rice" -> {
                                double cost = 1500;
                                System.out.println("Rice Bag");
                                System.out.println("Rice Cost:" + cost);
                                totalGroceriesCost += cost;
                            }

                            case "oil" -> {
                                double cost = 180;
                                System.out.println("Cooking Oil");
                                System.out.println("Oil Cost:" + cost);
                                totalGroceriesCost += cost;
                            }

                            case "sugar" -> {
                                double cost = 50;
                                System.out.println("Sugar");
                                System.out.println("Sugar Cost:" + cost);
                                totalGroceriesCost += cost;
                            }

                            case "milk" -> {
                                double cost = 70;
                                System.out.println("Milk");
                                System.out.println("Milk Cost:" + cost);
                                totalGroceriesCost += cost;
                            }

                            case "wheat" -> {
                                double cost = 250;
                                System.out.println("Wheat Flour");
                                System.out.println("Wheat Cost:" + cost);
                                totalGroceriesCost += cost;
                            }

                            default -> System.out.println("Invalid Grocery Item");
                        }

                        System.out.println("Total Groceries Cost:" + totalGroceriesCost);
                        System.out.println("Continue Next Item? Y for Yes / N for No:");
                        gyn = sc.next();

                    } while (gyn.equalsIgnoreCase("y"));
                }

                case "cosmetics" -> {
                    String cosyn = "";

                    do {
                        System.out.println("Enter your Item:");
                        String items = sc.next();

                        switch (items) {

                            case "lipstick" -> {
                                double cost = 500;
                                System.out.println("Lipstick");
                                System.out.println("Lipstick Cost:" + cost);
                                totalCosmeticsCost += cost;
                            }

                            case "powder" -> {
                                double cost = 300;
                                System.out.println("Face Powder");
                                System.out.println("Powder Cost:" + cost);
                                totalCosmeticsCost += cost;
                            }

                            case "perfume" -> {
                                double cost = 1200;
                                System.out.println("Perfume");
                                System.out.println("Perfume Cost:" + cost);
                                totalCosmeticsCost += cost;
                            }

                            case "shampoo" -> {
                                double cost = 250;
                                System.out.println("Shampoo");
                                System.out.println("Shampoo Cost:" + cost);
                                totalCosmeticsCost += cost;
                            }

                            case "facewash" -> {
                                double cost = 350;
                                System.out.println("Face Wash");
                                System.out.println("Face Wash Cost:" + cost);
                                totalCosmeticsCost += cost;
                            }

                            default -> System.out.println("Invalid Cosmetics Item");
                        }

                        System.out.println("Total Cosmetics Cost:" + totalCosmeticsCost);
                        System.out.println("Continue Next Item? Y for Yes / N for No:");
                        cosyn = sc.next();

                    } while (cosyn.equalsIgnoreCase("y"));
                }

                case "accessories" -> {
                    String ayn = "";

                    do {
                        System.out.println("Enter your Item:");
                        String items = sc.next();

                        switch (items) {

                            case "watch" -> {
                                double cost = 2000;
                                System.out.println("Watch");
                                System.out.println("Watch Cost:" + cost);
                                totalAccessoriesCost += cost;
                            }

                            case "bag" -> {
                                double cost = 1500;
                                System.out.println("Hand Bag");
                                System.out.println("Bag Cost:" + cost);
                                totalAccessoriesCost += cost;
                            }

                            case "belt" -> {
                                double cost = 500;
                                System.out.println("Belt");
                                System.out.println("Belt Cost:" + cost);
                                totalAccessoriesCost += cost;
                            }

                            case "wallet" -> {
                                double cost = 800;
                                System.out.println("Wallet");
                                System.out.println("Wallet Cost:" + cost);
                                totalAccessoriesCost += cost;
                            }

                            case "sunglasses" -> {
                                double cost = 1000;
                                System.out.println("Sunglasses");
                                System.out.println("Sunglasses Cost:" + cost);
                                totalAccessoriesCost += cost;
                            }

                            default -> System.out.println("Invalid Accessories Item");
                        }

                        System.out.println("Total Accessories Cost:" + totalAccessoriesCost);
                        System.out.println("Continue Next Item? Y for Yes / N for No:");
                        ayn = sc.next();

                    } while (ayn.equalsIgnoreCase("y"));
                }

                default -> System.out.println("Invalid Category");
            }

            System.out.println("Do You Want to Continue Next Category? Y for Yes / N for No:");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("y"));

        totalBill = totalElectronicsCost + totalClothingCost
                + totalFootwearCost + totalGroceriesCost
                + totalCosmeticsCost + totalAccessoriesCost;

        System.out.println("\n========== SHOPPING MALL BILL ==========");
        System.out.println("Total Electronics Cost:" + totalElectronicsCost);
        System.out.println("Total Clothing Cost:" + totalClothingCost);
        System.out.println("Total Footwear Cost:" + totalFootwearCost);
        System.out.println("Total Groceries Cost:" + totalGroceriesCost);
        System.out.println("Total Cosmetics Cost:" + totalCosmeticsCost);
        System.out.println("Total Accessories Cost:" + totalAccessoriesCost);
        System.out.println("----------------------------------------");
        System.out.println("Grand Total Bill:" + totalBill);

        System.out.println("Thank You! Visit Again.");

        sc.close();
    }
}





