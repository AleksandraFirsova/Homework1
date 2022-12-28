package core.cource_work;

public enum RepeatInterval {
    ONCE("Once"),
    DAILY("Daily"),
    WEEKLY("Weekly"),
    MONTHLY("Monthly"),
    YEARLY("Yearly");

    public final String value;

    RepeatInterval(String value) {
        this.value = value;
    }
}
