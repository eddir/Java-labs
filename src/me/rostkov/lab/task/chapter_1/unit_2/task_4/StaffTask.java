package me.rostkov.lab.task.chapter_1.unit_2.task_4;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class StaffTask extends BaseTask implements Task {
    public StaffTask() {
        this.id = "2.4";
        this.title = "Сотрудники и отделы";
        this.description = "Необходимо разработать сущность Сотрудник, которая описывается именем (в строковой форме)" +
                " и отделом, в котором сотрудник работает, причем у каждого отдела есть название и начальник, который" +
                " также является Сотрудником. Сотрудник может быть приведен к текстовой форме вида: “Имя работает в" +
                " отделе Название, начальник которого Имя”. В случае если сотрудник является руководителем отдела," +
                " то текстовая форма должна быть “Имя начальник отдела Название”.";
    }

    @Override
    public void start(Scanner in) {
        Department department = new Department("IT");

        Employee employee1 = new Employee("Петров", department);
        Employee employee2 = new Employee("Козлов", department);
        Employee employee3 = new Employee("Сидоров", department);

        department.setChief(employee2);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
