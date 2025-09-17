package AST.HTMLElementsAndBindings.Bindings;

public class EventName {
    private String eventName;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "EventName { " +
                "eventName = '" + eventName + '\'' +
                '}';
    }
}
