package core.hw7.recipes;

import java.util.Objects;

public class Product {

    private String name;
    private int cost;
    private int amount;

    public Product(String name, int cost, int amount) {
        setName(name);
        setCost(cost);
        setAmount(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = UtilsProducts.validateString(name);
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = UtilsProducts.validateInt(cost, 1);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = UtilsProducts.validateInt(amount, 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", amount=" + amount +
                '}';
    }
}
