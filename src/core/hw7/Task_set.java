package core.hw7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Task_set {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        while (set.size() < 20) {
            set.add(random.nextInt(1000));
        }
        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(set);
    }
}
