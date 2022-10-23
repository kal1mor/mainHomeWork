package com.example.homework11;


import java.util.ArrayList;

public class Shop  {
    ArrayList<Product> listOfProducts = new ArrayList();

    void addProduct(Product product){
        for (Product id : listOfProducts){
            if (id.getId() != product.getId()){
                listOfProducts.add(product);
            }
        }
    }

    public ArrayList<Product> getListOfProducts() {
        System.out.println(listOfProducts);
        return listOfProducts;
    }

    void deleteProduct(int id){
        listOfProducts.remove(id);
    }

    void editProduct (Product product){
        listOfProducts.set(0, product);

    }
}
