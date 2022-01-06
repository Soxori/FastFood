package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fastfood fastfood = new Fastfood(0, "KFC");
        System.out.println("cs vítej v " + fastfood.name);

        while(sc.hasNext()) {
            System.out.println("Zadej objednavku");

        }
    }
}
