package core.cource_work;

public class Counter {
    private static int idCounter = 0;

    public static int GetId() {
        idCounter += 1;
        return idCounter;
    }
}
