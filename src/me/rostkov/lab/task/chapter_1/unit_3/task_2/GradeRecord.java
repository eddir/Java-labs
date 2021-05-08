package me.rostkov.lab.task.chapter_1.unit_3.task_2;

public class GradeRecord implements Cloneable{
    private String subject;
    private String teacher;
    private int mark;

    public GradeRecord(String subject, String teacher, int mark) {
        this.subject = subject;
        this.teacher = teacher;
        this.mark = mark;
    }

    public GradeRecord clone() {
        try {
            return (GradeRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клон Point не поддерживается");
            return null;
        }
    }

    @Override
    public String toString() {
        return subject + ", " + teacher + ", " + mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
