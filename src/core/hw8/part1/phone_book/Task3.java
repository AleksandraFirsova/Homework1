package core.hw8.part1.phone_book;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        addString("str1", 2);
        check();
    }

    public static void addString(String key, Integer value) {
        if (map.containsKey(key) && map.containsValue(value)) {
            throw new RuntimeException("Ключ и значения совпадают");
        } else if (!map.containsKey(key) || !map.containsValue(value)) {
            map.put(key, value);
        }
    }

    public static Map<String, Integer> check() {
        addString("str2", 1);
        addString("str1", 2);
        addString("str1", 5);
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }
        return map;
    }
}
