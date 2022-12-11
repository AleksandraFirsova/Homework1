package core;

public class Utils {
    public static String validateString(String value, String defaultValue) {
        return value == null || value.isEmpty() || value.isBlank() ? defaultValue : value;
    }

    public static int validateIntNum(int value, int defaultValue) {
        return value <= 0 ? defaultValue : value;
    }

    public static float validateFloatNum(float value, float defaultValue) {
        return value <= 0 ? defaultValue : value;
    }

    public static double validateDoubleNum(double value, double defaultValue) {
        return value <= 0 ? defaultValue : value;
    }
}
