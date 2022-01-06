package com.company;

public class Fastfood {
    int stock;
    final String name;

    public Fastfood(int stock, String name) {
        this.stock = stock;
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }
}
