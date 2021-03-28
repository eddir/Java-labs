package me.rostkov.lab.task.chapter_1.unit_1;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO: в каких случаях бывает исключение и как правильно его обработать, чтобы не писать
            // во всех родительских методах throws CloneNotSupportedException ?
            System.out.println("Клон Point не поддерживается");
            return new Point();
        }
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + '}';
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
