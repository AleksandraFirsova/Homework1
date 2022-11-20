package basics.hw3;

public class Task6 {
    public static void main(String[] args) {
        byte amountBanana = 5;
        byte weightOneBanana = 80;
        short mlMilk = 200;
        short grOneHundredMilk = 105;
        byte amountIceCream = 2;
        byte grWeightOneIceCream = 100;
        byte amountEggs = 4;
        byte grWeightOneEgg = 70;

        int weightBreakfast = (amountBanana * weightOneBanana + mlMilk * grOneHundredMilk + amountIceCream * grWeightOneIceCream + amountEggs * grWeightOneEgg)/1000;
        System.out.println("Вес завтрака составляет " + weightBreakfast + " кг");
    }
}
