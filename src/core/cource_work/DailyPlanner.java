package core.cource_work;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DailyPlanner {
    private HashMap<Integer, PlannerTask> addedTask = new HashMap<>();

    public void addTask(PlannerTask plannerTask) {
        addedTask.put(plannerTask.getId(), plannerTask);
    }

    public void removeTask(int id) {
        addedTask.remove(id);
    }

    public List<PlannerTask> getTasks(LocalDateTime dateTime) {
        List<PlannerTask> resultList = new ArrayList<>();

        for (PlannerTask plannerTask : addedTask.values()) {
            if (plannerTask.getInterval() == RepeatInterval.ONCE &&
                    dateTime.getYear() == plannerTask.getDate().getYear() &&
                    dateTime.getMonthValue() == plannerTask.getDate().getMonthValue() &&
                    dateTime.getDayOfMonth() == plannerTask.getDate().getDayOfMonth()
            ) {
                resultList.add(plannerTask);
            }
            if (plannerTask.getInterval() == RepeatInterval.DAILY) {
                resultList.add(plannerTask);
            }
            if (plannerTask.getInterval() == RepeatInterval.WEEKLY &&
                    dateTime.getDayOfWeek() == plannerTask.getDate().getDayOfWeek()) {
                resultList.add(plannerTask);
            }
            if (plannerTask.getInterval() == RepeatInterval.MONTHLY) {
                if (plannerTask.getDate().getDayOfMonth() == dateTime.getDayOfMonth()) {
                    resultList.add(plannerTask);
                    continue;
                }

                //If task created on last day of month
                /*boolean lastDateOfMonthPlaner = plannerTask.getDate().getDayOfMonth() == plannerTask.getDate().with(lastDayOfMonth()).getDayOfMonth();
                boolean lastDateOfMonthDate = dateTime.getDayOfMonth() == dateTime.with(lastDayOfMonth()).getDayOfMonth();

                if (lastDateOfMonthPlaner && lastDateOfMonthDate) {
                    resultList.add(plannerTask);
                }*/
            }
            if (plannerTask.getInterval() == RepeatInterval.YEARLY &&
                    dateTime.getDayOfYear() == plannerTask.getDate().getDayOfYear()) {
                resultList.add(plannerTask);
            }
        }
        return resultList;
    }


}
