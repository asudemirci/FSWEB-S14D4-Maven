package org.example.model;

import org.example.rpg.Troll;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Dark Chocolate", 3.5, "Bitter, rich flavor");
        products[1] = new Coke("Cola", 2.0, "Refreshing beverage");
        products[2] = new Bread("Whole Wheat", 1.5, "Healthy and nutritious");
        Troll troll = new Troll("Shrek", 100, 100.0);


        //listProducts();
    }

    public static void listProducts(ProductForSale[] products) {
    for (ProductForSale product : products ) {
        product.showDetails();
    }
    }
}