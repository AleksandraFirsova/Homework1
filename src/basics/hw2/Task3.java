package basics.hw2;

public class Task3 {
    public static void main(String[] args) {
        //Задание 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumWeight = firstBoxerWeight + secondBoxerWeight;
        var difWeight = secondBoxerWeight - firstBoxerWeight;

        System.out.println("Общий вес боксеров: " + sumWeight + " кг");
        System.out.println("Разница в весе боксеров составляет: " + difWeight + " кг");
        System.out.println("");

        //Задание 7
        var difWeightFirst = difWeight;
        var difWeightSecond = secondBoxerWeight % firstBoxerWeight;

        System.out.println("Разница в весе боксеров, рассчитанная по первому способу, составляет: " + difWeightFirst + " кг");
        System.out.println("Разница в весе боксеров, рассчитанная по второму способу, составляет: " + difWeightSecond + " кг");
        System.out.println("");

        //Задание 8 (Часть первая)
        var amountHour = 640;
        var amountHourForOnePerson = 8;
        var amountPerson = amountHour/amountHourForOnePerson;

        System.out.println("Всего работников в компании – " + amountPerson + " человек");
        System.out.println("");

        //Задание 8 (Часть вторая)
        var anotherAmountPerson = amountPerson + 94;
        var anotherAmountHour = anotherAmountPerson * amountHourForOnePerson;

        System.out.println("Если в компании работает " + anotherAmountPerson + " человек, то всего " + anotherAmountHour + " часов работы может быть поделено между сотрудниками");
    }
}
