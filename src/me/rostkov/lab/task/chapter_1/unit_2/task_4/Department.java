package me.rostkov.lab.task.chapter_1.unit_2.task_4;

public class Department {

    private String name;
    private Employee chief;

    public Department(String name, Employee chief) {
        this.name = name;
        this.chief = chief;
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getChief() {
        return chief;
    }

    public void setChief(Employee chief) {
        this.chief = chief;
    }
}
