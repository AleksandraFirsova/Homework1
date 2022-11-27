package core.hw2.task1.flower;

public class Bouquet {

    public static int getMinLifeSpanBouquet(Flower[] bouquet) {
        int min = bouquet[0].getLifeSpan();
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i].getLifeSpan() < min) {
                min = bouquet[i].getLifeSpan();
            }
        }
        return min;
    }

    public static float getCostBouquet(Flower[] bouquet) {
        float cost = 0;
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i] != null) {
                cost = cost + bouquet[i].getCost();
            }
        }
        return cost;
    }

    public static String getNameFlowersInBouquet(Flower[] bouquet) {
        StringBuilder flowers = new StringBuilder(bouquet[0].getName());
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i].getName() != null) {
                flowers.append(", ").append(bouquet[i].getName());
            }
        }
        return flowers.toString();
    }

    public static void getInfoBouquet(Flower[] bouquet) {
        System.out.println("Букет, в котором есть " + getNameFlowersInBouquet(bouquet) + " будет стоить " + getCostBouquet(bouquet) + " рублей и простоит " + getMinLifeSpanBouquet(bouquet) + " суток.");
    }
}
