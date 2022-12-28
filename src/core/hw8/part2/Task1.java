package core.hw8.part2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        Map<String, List<Integer>> stringListMap = new HashMap<>();

        stringListMap.put("String_1", List.of(11, 13, 100));
        stringListMap.put("String_2", List.of(114, 153, 110));
        stringListMap.put("String_3", List.of(67, 44, 7));
        stringListMap.put("String_4", List.of(78, 99, 234));
        stringListMap.put("String_5", List.of(45, 88, 17));
        System.out.println(stringListMap.entrySet());

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        for (Map.Entry<String, List<Integer>> stringListEntry : stringListMap.entrySet()) {
            stringIntegerMap.put(stringListEntry.getKey(), sum(stringListEntry.getValue()));
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }
    }

    public static Integer sum(List<Integer> list) {
        Integer sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
