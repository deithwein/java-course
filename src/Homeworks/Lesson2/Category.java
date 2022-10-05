package Homeworks.Lesson2;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }
}
