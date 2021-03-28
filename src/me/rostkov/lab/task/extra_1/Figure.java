package me.rostkov.lab.task.extra_1;

public interface Figure {

    int width = 4;

    int height = 5;

    public int getSquare();

    default public int getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

}
