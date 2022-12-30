package core.cource_work;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dailyPlanner = new DailyPlanner();

        try {
            dailyPlanner.addTask(new PlannerTask("header", "Description", RepeatInterval.DAILY, Type.WORK).setDate(LocalDateTime.now()));
            dailyPlanner.addTask(new PlannerTask("header", "Description", RepeatInterval.ONCE, Type.PERSONAL).setDate( LocalDateTime.now().plusDays(1)));
        } catch (PlannerTaskInitializationException e) {
            System.out.println(e.getMessage());
            return;
        }/*

        List<PlannerTask> tasks = dailyPlanner.getTasks(LocalDateTime.now().plusDays(0));

        for (PlannerTask task : tasks) {
            System.out.println(task.getId());
        }*/

        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    try {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                                PlannerTask task = inputTask(scanner);
                                dailyPlanner.addTask(task);
                            break;
                        case 2:
                            System.out.print("Введите id задачи: ");
                            String id = scanner.next();
                            dailyPlanner.removeTask(Integer.parseInt(id));
                            break;
                        case 3:
                            System.out.println("Введите дату в формате YYYY-MM-DD: ");
                            scanner.nextLine();

                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                            String date = scanner.nextLine();
                            List<PlannerTask> taskList = dailyPlanner.getTasks(LocalDate.parse(date, formatter).atStartOfDay());
                            printTasks(taskList);
                            break;
                        case 0:
                            break label;
                    }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Выберите пункт меню из списка!");
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void printTasks(List<PlannerTask> taskList) {
        for (PlannerTask plannerTask : taskList) {
            System.out.println("id: " + plannerTask.getId());
            System.out.println("header: " + plannerTask.getHeader());
            System.out.println("description: " + plannerTask.getDescription());
            System.out.println("interval: " + plannerTask.getInterval());
            System.out.println("type: " + plannerTask.getType());
        }
    }

    private static PlannerTask inputTask(Scanner scanner) throws PlannerTaskInitializationException {
        System.out.println("Введите название задачи: ");
        String header = scanner.next();
        System.out.println("Введите описание задачи: ");
        String description = scanner.next();

        System.out.println("Введите тип задачи (WORK, PERSONAL): ");
        String type = scanner.next();

        System.out.println("Введите интервал задачи (ONCE, DAILY, WEEKLY, MONTHLY, YEARLY): ");
        String interval = scanner.next();

        System.out.println("Введите дату: ");
        scanner.nextLine();
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //yyyy-MM-dd HH:mm
        return new PlannerTask(
                header,
                description,
                RepeatInterval.valueOf(interval),
                Type.valueOf(type)
        ).setDate(LocalDateTime.parse(date, formatter));

    }

    private static void printMenu() {
        System.out.println(
                "1. Добавить задачу\n2. Удалить задачу\n3. Получить задачу на указанный день\n0. Выход"
        );
    }
}
