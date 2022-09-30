package hw3;

public class Task5 {
    public static void main(String[] args) {
        byte allCan = 120;
        byte whiteColorForOneClass = 2;
        byte brownColorForOneClass = 4;

        int allClass = allCan/(whiteColorForOneClass + brownColorForOneClass);
        int whiteColorForAllClass = allClass * whiteColorForOneClass;
        int brownColorForAllClass = allClass * brownColorForOneClass;

        System.out.println("В школе, где " + allClass +  " классов, нужно " + whiteColorForAllClass + " банок белой краски и " + brownColorForAllClass + " банок коричневой краски");
    }
}
