package ru.mirea.laba_3;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        System.out.println("Welcome to our store!\n" +
                "Please specify the type of furniture you are interested in (1 - sofa; 2 - wardrobe):");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 1) {
            Sofa Sofa1 = new Sofa(true, 8, "black", 250.7, 150.0);
            Sofa Sofa2 = new Sofa(true, 10, "brown", 240.0, 160.0);
            Sofa Sofa3 = new Sofa(true, 4, "green", 255.5, 165.0);
            System.out.println("Sofas are available:\n" +
                    Sofa1.toString() + "\n" + Sofa2.toString() + "\n" + Sofa3.toString() + "\n" +
                    "Which sofa do you want to buy? (write \"pay *\")");
            Scanner in1 = new Scanner(System.in);
            String str = in1.nextLine();
            switch (str) {
                case "pay 1":
                    Sofa1.setQuantity(Sofa1.getQuantity() - 1);
                    break;
                case "pay 2":
                    Sofa2.setQuantity(Sofa2.getQuantity() - 1);
                    break;
                case "pay 3":
                    Sofa3.setQuantity(Sofa3.getQuantity() - 1);
                    break;
            }
            System.out.println("Thanks for the purchase");
        }

        else if (num == 2) {
            Wardrobe Wardrobe1 = new Wardrobe(true, 14, "black", 50.7, 35.0, 270.0);
            Wardrobe Wardrobe2 = new Wardrobe(true, 26, "red", 60.5, 45.0, 260.0);
            Wardrobe Wardrobe3 = new Wardrobe(true, 7, "white", 62.5, 55.0, 275.0);
            System.out.println("Wardrobes are available:\n" +
                    Wardrobe1.toString() + "\n" + Wardrobe2.toString() + "\n" + Wardrobe3.toString() + "\n" +
                    "Which wardrobe do you want to buy? (write \"pay *\")");
            Scanner in1 = new Scanner(System.in);
            String str = in1.nextLine();
            switch (str) {
                case "pay 1":
                    Wardrobe1.setQuantity(Wardrobe1.getQuantity() - 1);
                    break;
                case "pay 2":
                    Wardrobe2.setQuantity(Wardrobe2.getQuantity() - 1);
                    break;
                case "pay 3":
                    Wardrobe3.setQuantity(Wardrobe3.getQuantity() - 1);
                    break;
            }
            System.out.println("Thanks for the purchase");
        }
    }
}
