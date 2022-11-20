package basics.hw2;

public class Task1 {

    public static void main(String[] args) {
        //Задание 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog: " + dog + ", " + "cat: " + cat + ", " + "paper: " + paper);
        System.out.println("");

        //Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog: " + dog + ", " + "cat: " + cat + ", " + "paper: " + paper);
        System.out.println("");

        //Задание 3
        double anotherDog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog: " + anotherDog + ", " + "cat: " + cat + ", " + "paper: " + paper);
    }
}
