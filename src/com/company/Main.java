package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fastfood fastfood = new Fastfood("KFC");
        System.out.println("Welcome to " + fastfood.name + "\nWhats your order ?");

        while(sc.hasNextInt()) {
            int input = sc.nextInt();
            fastfood.SellChickens(input);
            System.out.println("Supplies on stock " + fastfood.stock);
            System.out.println("Whats your order ?");
        }
    }
}
