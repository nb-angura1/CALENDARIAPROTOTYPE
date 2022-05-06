public class Event {
    private String eventName;
    private int time; //time the event begins in 24-hour clock
    private int length;
    public Event(String eventName, int time, int length){
        this.eventName = eventName;
        this.time = time;
        this.length = length;
    }
}
