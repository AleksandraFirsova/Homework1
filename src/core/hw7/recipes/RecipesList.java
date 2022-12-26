package core.hw7.recipes;

import java.util.HashSet;
import java.util.Set;

public class RecipesList {
    private Set<Recipe> allRecipes = new HashSet<>();

    public void addRecipes(Recipe recipe) {
        if (allRecipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
        allRecipes.add(recipe);
    }

    public void removeProduct(Recipe recipe) {
        if (!allRecipes.remove(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
        allRecipes.remove(recipe);
    }
}
