package me.rostkov.lab.task.extra.extra_2;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Event {
    private GregorianCalendar dateStart;
    private GregorianCalendar dateEnd;
    private String title;
    private String description;
    private String place;
    private boolean intersect;

    public Event(GregorianCalendar dateStart, GregorianCalendar dateEnd, String title, String description, String place) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.title = title;
        this.description = description;
        this.place = place;
        this.intersect = false;
    }

    public String toString() {
        return String.format("%s\n\n%s\n\nНачало в %s\nОкончание в %s\nМесто - %s\nПересекается - %s",
                title,
                description,
                dateStart.toZonedDateTime().format(DateTimeFormatter.ofPattern("dd/MM/uuuu hh:mm")),
                dateEnd.toZonedDateTime().format(DateTimeFormatter.ofPattern("dd/MM/uuuu hh:mm")),
                place,
                intersect ? "да" : "нет");
    }

    public Calendar getDateStart() {
        return dateStart;
    }

    public void setDateStart(GregorianCalendar dateStart) {
        this.dateStart = dateStart;
    }

    public GregorianCalendar getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(GregorianCalendar dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean isIntersect() {
        return intersect;
    }

    public void setIntersect(boolean intersect) {
        this.intersect = intersect;
    }
}
