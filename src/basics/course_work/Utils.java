package basics.course_work;

public class Utils {
    private static int idCounter = 0;

    public static int GetId() {
        idCounter += 1;
        return idCounter;
    }
}
