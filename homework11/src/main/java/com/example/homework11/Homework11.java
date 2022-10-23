package com.example.homework11;

import com.sun.jdi.IntegerValue;

import java.util.Collections;
import java.util.Comparator;

public class Homework11 {

    public static void main(String[] args) {
        Product bread = new Product(0, "bread", 200);
        Product milk = new Product(1, "milk", 300);
        Product soap = new Product(2, "soap", 100);
        Product coffee = new Product(3, "coffee", 500);
        Shop shop = new Shop();
        shop.addProduct(bread);
        shop.addProduct(milk);
        shop.addProduct(soap);
        shop.addProduct(coffee);
        shop.getListOfProducts();
        Collections.sort(shop.listOfProducts, new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return Integer.valueOf(product.getPrice()).compareTo(Integer.valueOf(t1.getPrice()));
            }
        });
        System.out.println();
        System.out.println(shop.listOfProducts);
        shop.deleteProduct(soap.getId());
        shop.editProduct(coffee);
        System.out.println();
        System.out.println(shop.listOfProducts);

    }

}