package core.hw7.recipes;

public class Main {

    public static void main(String[] args) {
        Product fish = new Product("Рыба", 150, 2);
        Product oil = new Product("Лук", 16, 0);
        ProductList productList = new ProductList();
        productList.addProduct(fish);
        productList.addProduct(oil);
        System.out.println("Продукт \"" + fish.getName() + "\" добавлен, его количество " + fish.getAmount() + " кг");
        System.out.println("Продукт \"" + oil.getName() + "\" добавлен, его количество " + oil.getAmount() + " кг");

        Recipe recipe = new Recipe(productList, 1500, "Рыбный пирог");

        RecipesList recipesList = new RecipesList();
        recipesList.addProductToRecipe(fish);
        System.out.println("Рецепт \"" + recipe.getNameRecipe() + "\" добавлен");
    }
}
