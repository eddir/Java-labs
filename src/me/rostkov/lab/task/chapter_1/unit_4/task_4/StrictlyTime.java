package me.rostkov.lab.task.chapter_1.unit_4.task_4;

public class StrictlyTime {
    private final int seconds;

    public StrictlyTime(int seconds) {
        this.seconds = seconds;
    }

    public StrictlyTime(int hours, int minutes, int seconds) {
        this(hours * 3600 + minutes * 60 + seconds);
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

}
