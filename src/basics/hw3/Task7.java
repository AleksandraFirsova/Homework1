package basics.hw3;

public class Task7 {
    public static void main(String[] args) {
        short allWeightForWeightLoss = 7000;
        short weightForWeightLossOneDayFirst = 250;
        short weightForWeightLossOneDayLast = 500;
        int amountDayForWeightLossFirst = allWeightForWeightLoss/weightForWeightLossOneDayFirst;
        int amountDayForWeightLossLast = allWeightForWeightLoss/weightForWeightLossOneDayLast;
        int averageDays = (amountDayForWeightLossFirst + amountDayForWeightLossLast)/2;

        System.out.println(amountDayForWeightLossFirst + " дней уйдет на похудение, если спортсмен будет терять по " + weightForWeightLossOneDayFirst + " г в день");
        System.out.println(amountDayForWeightLossLast + " дней уйдет на похудение, если спортсмен будет терять по " + weightForWeightLossOneDayLast + " г в день");
        System.out.println(averageDays + " дней уйдет в среднем");
    }
}
