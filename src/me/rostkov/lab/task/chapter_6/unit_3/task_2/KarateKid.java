package me.rostkov.lab.task.chapter_6.unit_3.task_2;

public class KarateKid {
    private final String name;

    public KarateKid(String name) {
        this.name = name;
    }

    public void footShot(){
        System.out.println(name + ": бац!");
    }

    public void handShot(){
        System.out.println(name + ": кия!");
    }

    public void jumpShot(){
        System.out.println(name + ": вжух!");
    }

    public void knock(ShotStrategy strategy) {
        for (Shot shot : strategy.shots) {
            switch (shot) {
                case FOOT -> footShot();
                case HAND -> handShot();
                case JUMP -> jumpShot();
            }
        }
    }

    public String getName() {
        return name;
    }
}
