package core.hw6.part2;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Task2 {
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;

    private static final List<String> NAMES = List.of(
            "Иванов Иван",
            "Рощин Игорь",
            "Андреева Анна",
            "Шульженко Наталья",
            "Шерстнева Дарья"
    );

    public static void main(String[] args) {

        Queue<String> firstQueue = new ArrayDeque<>();
        Queue<String> secondQueue = new ArrayDeque<>();

        randomFeeling(firstQueue);
        randomFeeling(secondQueue);
    }

    private static void add(String name, Queue<String> firstQueue, Queue<String> secondQueue) {
        if (firstQueue.size() == MAX_SIZE && secondQueue.size() == MAX_SIZE) {
            System.out.println("Позвать Галю");
            return;
        }
        if (firstQueue.size() < secondQueue.size()) {
            firstQueue.offer(name);
        } else {
            secondQueue.offer(name);
        }
    }

    private static void randomFeeling(Queue<String> queue) {
        int size = RANDOM.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
}
