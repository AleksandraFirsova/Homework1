package core.hw7.recipes;

import java.util.Objects;

public class Recipe {
    private ProductList productSet;
    private int allCost;
    private String nameRecipe;

    public Recipe(ProductList productSet, int allCost, String nameRecipe) {
        this.productSet = productSet;
        this.allCost = allCost;
        this.nameRecipe = nameRecipe;
    }

    public ProductList getProductSet() {
        return productSet;
    }

    public void setProductSet(ProductList productSet) {
        this.productSet = productSet;
    }

    public int getAllCost() {
        return allCost;
    }

    public void setAllCost(int allCost) {
        this.allCost = UtilsProducts.validateInt(allCost);
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = UtilsProducts.validateString(nameRecipe);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(productSet, recipe.productSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productSet);
    }
}
