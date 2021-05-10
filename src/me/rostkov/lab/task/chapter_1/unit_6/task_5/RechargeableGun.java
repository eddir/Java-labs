package me.rostkov.lab.task.chapter_1.unit_6.task_5;

import me.rostkov.lab.task.chapter_1.unit_5.task_1.Gun;

public class RechargeableGun extends Gun {
    private final int maxAmmunition;

    public RechargeableGun(int ammunition, int maxAmmunition) {
        super(ammunition);
        this.maxAmmunition = maxAmmunition;
    }

    public RechargeableGun(int maxAmmunition) {
        super(0);
        this.maxAmmunition = maxAmmunition;
    }
    
    public int recharge(int patrons) {
        if (patrons < 0) {
            throw new IllegalArgumentException("Число патронов не может быть отрицательным.");
        }
        if (ammunition + patrons > maxAmmunition) {
            int excess = ammunition + patrons - maxAmmunition;
            ammunition = maxAmmunition;
            return excess;
        }
        ammunition += patrons;
        return 0;
    }
    
    public int discharge() {
        int patrons = ammunition;
        ammunition = 0;
        return patrons;
    }

    public int getAmmunition() {
        return super.ammunition;
    }

    public int getMaxAmmunition() {
        return maxAmmunition;
    }

    public boolean isDischarged() {
        return super.ammunition == 0;
    }
}
