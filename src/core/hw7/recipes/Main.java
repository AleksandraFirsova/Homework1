package core.hw7.recipes;

public class Main {

    public static void main(String[] args) {
        Product fish = new Product("Рыба", 150, 2);
        Product oil = new Product("Лук", 16, 3);
        ProductList productList = new ProductList();
        productList.addProduct(fish);
        productList.addProduct(oil);
        System.out.println("Продукт \"" + fish.getName() + "\" добавлен");
        System.out.println("Продукт \"" + oil.getName() + "\" добавлен");

        Recipe recipe = new Recipe(productList, 1500, "Рыбный пирог");

        RecipesList recipesList = new RecipesList();
        recipesList.addRecipes(recipe);
        System.out.println("Рецепт \"" + recipe.getNameRecipe() + "\" добавлен");
    }
}
