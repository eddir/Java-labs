package me.rostkov.lab.task.chapter_1.unit_1.task_5;

public class Time {

    private int seconds;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        byte hours = (byte) ((this.seconds % (3600 * 24)) / 3600);
        byte minutes = (byte) ((this.seconds % 3600) / 60);
        byte seconds = (byte) (this.seconds % 60);

        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
