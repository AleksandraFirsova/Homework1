package basics.hw3;

public class Task3 {
    public static void main(String[] args) {
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short allAmountClasses = 3;
        short allAmountPaper = 480;

        int allAmountListForOneClass = allAmountPaper/allAmountClasses;
        int allAmountListForEveryStudentInFirstClas = allAmountListForOneClass/firstClass;
        int allAmountListForEveryStudentInSecondClas = allAmountListForOneClass/secondClass;
        int allAmountListForEveryStudentInThirdClas = allAmountListForOneClass/thirdClass;

        System.out.println("На каждого ученика в первом классе рассчитано " + allAmountListForEveryStudentInFirstClas + " листов");
        System.out.println("На каждого ученика во втором классе рассчитано " + allAmountListForEveryStudentInSecondClas + " листов");
        System.out.println("На каждого ученика в третьем классе рассчитано " + allAmountListForEveryStudentInThirdClas + " листов");
    }
}
