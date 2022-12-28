package core.cource_work;

import java.time.LocalDateTime;
import java.util.Objects;

public class PlannerTask {

    private String header;
    private String description;
    private RepeatInterval interval;
    private Type type;
    private LocalDateTime date;
    private int id;

    public PlannerTask(String header, String description, RepeatInterval interval, Type type) throws PlannerTaskInitializationException {
        setHeader(header);
        setDescription(description);
        this.interval = interval;
        this.type = type;
        this.id = Counter.GetId();
    }

    public String getHeader() {
        return header;
    }

    public String getDescription() {
        return description;
    }

    public RepeatInterval getInterval() {
        return interval;
    }

    public Type getType() {
        return type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public PlannerTask setHeader(String header) throws PlannerTaskInitializationException {
        if (header.isEmpty()) {
            throw new PlannerTaskInitializationException("Invalid header");
        }
        this.header = header;
        return this;
    }

    public PlannerTask setDescription(String description) throws PlannerTaskInitializationException {
        if (description.isEmpty()) {
            throw new PlannerTaskInitializationException("Invalid description");
        }
        this.description = description;
        return this;
    }

    public PlannerTask setInterval(RepeatInterval interval) throws PlannerTaskInitializationException {
        if (interval == null) {
            throw new PlannerTaskInitializationException("Invalid interval");
        }
        this.interval = interval;
        return this;
    }

    public PlannerTask setType(Type type) throws PlannerTaskInitializationException {
        if (type == null) {
            throw new PlannerTaskInitializationException("Invalid type");
        }
        this.type = type;
        return this;
    }

    public PlannerTask setDate(LocalDateTime date) throws PlannerTaskInitializationException {
        if (date == null) {
            throw new PlannerTaskInitializationException("Invalid date");
        }
        this.date = date;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlannerTask that = (PlannerTask) o;
        return id == that.id && Objects.equals(header, that.header) && Objects.equals(description, that.description) && interval == that.interval && type == that.type && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, description, interval, type, date, id);
    }

    @Override
    public String toString() {
        return "PlannerTask{" +
                "header='" + header + '\'' +
                ", description='" + description + '\'' +
                ", interval=" + interval +
                ", type=" + type +
                ", date=" + date +
                ", id=" + id +
                '}';
    }
}
