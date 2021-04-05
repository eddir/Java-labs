package me.rostkov.lab.task.extra.extra_2;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private ArrayList<Event> events;

    public Calendar() {
        this.events = new ArrayList<Event>() {};
    }

    public void addEvent(Event event) {
        for (Event ev : this.events) {
            if ((ev.getDateStart().compareTo(event.getDateStart()) <= 0 &&
                    ev.getDateEnd().compareTo(event.getDateEnd()) >= 0)
                    ||
                    (ev.getDateStart().compareTo(event.getDateStart()) >= 0 &&
                            ev.getDateStart().compareTo(event.getDateEnd()) <= 0)
                    ||
                    (ev.getDateEnd().compareTo(event.getDateStart()) >= 0 &&
                            ev.getDateEnd().compareTo(event.getDateEnd()) <= 0)
                    ||
                    (ev.getDateStart().compareTo(event.getDateStart()) >= 0 &&
                            ev.getDateEnd().compareTo(event.getDateEnd()) <= 0)
            ){
                event.setIntersect(true);
                ev.setIntersect(true);
            }
        }
        this.events.add(event);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Event event : events) {
            str.append(event).append("\n\n---\n\n");
        }

        return str.toString();
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }
}
