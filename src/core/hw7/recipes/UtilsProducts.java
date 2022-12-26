package core.hw7.recipes;

public class UtilsProducts {
    public static String validateString(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            throw new IllegalArgumentException("Название товара не может быть пустым");
        }
        return value;
    }

    public static int validateInt(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Цена или количество товаров не могут быть пустыми");
        }
        return value;
    }
}
