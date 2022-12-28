package core.hw7.recipes;

import core.hw7.recipes.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже куплен");
        }
        products.add(product);
    }

    public void removeProduct(Product product) {
        if (!products.remove(product)) {
            throw new IllegalArgumentException("Такой продукт уже куплен");
        }
        products.remove(product);
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "products=" + products +
                '}';
    }
}
