package me.rostkov.lab.task.chapter_3.unit_2.task_1;

public class Pistol extends Weapon{
    private final int maxAmmunition;

    public Pistol(int ammo, int maxAmmunition) {
        super(ammo);
        this.maxAmmunition = maxAmmunition;
    }

    public Pistol(int maxAmmunition) {
        super(0);
        this.maxAmmunition = maxAmmunition;
    }

    @Override
    void shoot() {
        if (super.getAmmo()) {
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }

    public int recharge(int patrons) {
        if (super.ammo() < 0) {
            throw new IllegalArgumentException("Число патронов не может быть отрицательным.");
        }
        if (super.ammo() + patrons > maxAmmunition) {
            int excess = super.ammo() + patrons - maxAmmunition;
            super.load(maxAmmunition - super.ammo());
            return excess;
        }
        super.load(patrons);
        return 0;
    }

    public int discharge() {
        int patrons = super.ammo();
        while (true) {
            if (!super.getAmmo()) {
                break;
            }
        }
        return patrons;
    }
}
