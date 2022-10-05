package Homeworks.Lesson2;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> boughtProducts = new ArrayList<>();

    public void setBoughtProducts(List<Product> boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    public List<Product> getBoughtProducts() {
        return boughtProducts;
    }
}
