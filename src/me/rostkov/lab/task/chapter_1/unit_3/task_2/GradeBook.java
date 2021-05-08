package me.rostkov.lab.task.chapter_1.unit_3.task_2;

public class GradeBook {
    private long id;
    private String name;
    public GradeRecord[] records;

    public GradeBook(long id, String name, GradeRecord[] records) {
        this.id = id;
        this.name = name;
        this.records = records;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(name + ", " + id + ":\n");

        for (GradeRecord record: records) {
            str.append("   ").append(record.toString()).append("\n");
        }

        return str.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
