package core.hw7.recipes;

import java.util.HashMap;
import java.util.Map;

public class RecipesList {
    private HashMap<Product, Integer> allRecipes = new HashMap<>();

    public void checkAddedProductToRecipes(String name) {
        boolean isBought = false;
        for (Map.Entry<Product, Integer> product : allRecipes.entrySet()) {
            if (product.getKey().getName().equals(name)) {
                System.out.println(name + " куплен");
                isBought = true;
                break;
            }
        }
        if (!isBought) {
            System.out.println(name + " не куплен");
        }
    }

    public void addProductToRecipe(Product product) {
        if (product == null) {
            return;
        }
        if (allRecipes.containsKey(product)) {
            Integer productCount = allRecipes.get(product);
            allRecipes.put(product, ++productCount);
        } else {
            allRecipes.put(product, 1);
        }
    }

    public double getTotalCostAllProducts() {
        double totalCostOfProduct = 0.0;
        for (Map.Entry<Product, Integer> product : allRecipes.entrySet()) {
            totalCostOfProduct += product.getKey().getCost() * product.getValue();
        }
        return totalCostOfProduct;
    }

    public void removeProduct(Product product, Integer amount) {
        if (!allRecipes.remove(product, amount)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
        allRecipes.remove(product);
    }

    @Override
    public String toString() {
        return "RecipesList{" +
                "allRecipes=" + allRecipes +
                '}';
    }
}
