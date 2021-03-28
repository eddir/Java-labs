package me.rostkov.lab.task.extra.extra_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

public class ExtraInterfaceTask extends BaseTask implements Task {

    public ExtraInterfaceTask(){
        this.id = "E.1";
        this.title = "Интерфейсы";
        this.description = "Демонстрация работы интерфейсов и свойства default для методов интерфейса.";
    }

    public void start() {
        Square square = new Square();
        System.out.println("Square = " + square.getSquare());
        System.out.println("Perimeter = " + square.getPerimeter());
    }
}
