package me.rostkov.lab.task.chapter_1.unit_5.task_1;

public class Gun {
    private int ammunition;

    public Gun(int ammunition) {
        this.ammunition = ammunition;
    }

    public Gun() {
        this(5);
    }

    public void shoot() {
        if (ammunition > 0) {
            System.out.println("Бах!");
            ammunition--;
        } else {
            System.out.println("Клац!");
        }
    }
}
