package me.rostkov.lab.task.chapter_1.unit_2.task_4;

public class Employee {

    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        if (this.department.getChief() == this) {
            return String.format("%s начальник отдела %s", this.name, this.department.getName());
        }
        return String.format("%s работает в отделе %s, начальник которого %s",
                this.name,
                this.department.getName(),
                this.department.getChief().getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
