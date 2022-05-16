import java.time.LocalDateTime;
public class Event {
    String eventName;
    int time; //time the event begins in 24-hour clock
    int length;
    public Event(String eventName, DateTime time, int length){
        this.eventName = eventName;
        this.time = time;
        this.length = length;
    }
}
