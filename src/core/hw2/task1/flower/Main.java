package core.hw2.task1.flower;

import static core.hw2.task1.flower.Bouquet.getInfoBouquet;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("красный", "Голландия", 35.59f, "Роза", 0);
        Flower chrysanthemum = new Flower(null, null, 15.00f, "Хризантема", 5);
        Flower peony = new Flower(null, "Англия", 69.90f, "Пион", 1);
        Flower gypsophila = new Flower(null, "Турция", 19.50f, "Гипсофила", 10);

        Flower[] bouquet = new Flower[]{peony, chrysanthemum, gypsophila, peony, rose};

        getInfoBouquet(bouquet);
    }
}
