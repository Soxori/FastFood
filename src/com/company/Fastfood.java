package com.company;

public class Fastfood {
    int stock;
    final String name;

    public Fastfood(String name) {
        this.stock = 0;
        this.name = name;
    }
    public void BuyChickens(int amount) {
        int storageOfChickens = stock - amount;
        if(storageOfChickens <= 0 ) {
            stock += amount * 2;
            System.out.println("Selling " + amount + " of chicken");
            System.out.println("Increasing stock by " + stock);
        }
        stock -= amount;
        System.out.println("Decreasing stock by " + stock);
    }
    public void SellChickens(int amount) {
        BuyChickens(amount);
    }
}
