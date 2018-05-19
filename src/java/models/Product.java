package models;

import java.util.ArrayList;
import java.util.List;

public class Product {
    
    public static List<Product> products = new ArrayList<Product>(){
        {
            add(new Product(1,"HP Laptop",100));
            add(new Product(2,"IBM Desktop",200));
            add(new Product(3,"Cannon Printer",300));
        }
    };
    
    private int id;
    private String name;
    private float price;
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public Product getProduct(int id) {
        return products.get(id);
    }
 
}