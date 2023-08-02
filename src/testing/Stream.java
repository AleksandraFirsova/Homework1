package testing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;


public class Stream {

    static ArrayList<Integer> list = new ArrayList<>(List.of(3, 6, 8, 2));

    public static <T> void findMinMax(
            java.util.stream.Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if (!list.isEmpty()) {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }

    public static List<Integer> countNumberOfEven(List<Integer> number) {
        return number.stream().filter((n) -> (n % 2) == 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        findMinMax(list.stream(), Integer::compareTo, (x, y) -> System.out.println(x + ", " + y));
        System.out.println(countNumberOfEven(list));
    }
}
