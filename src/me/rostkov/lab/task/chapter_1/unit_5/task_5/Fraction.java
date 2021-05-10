package me.rostkov.lab.task.chapter_1.unit_5.task_5;

public class Fraction {
    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может равняться нулю.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }

    public Fraction sum(Fraction f) {
        return new Fraction(this.numerator * f.denominator + f.numerator * this.denominator,
                this.denominator * f.denominator);
    }
    

    public Fraction sum(int num) {
        return new Fraction(this.numerator + this.denominator * num, this.denominator);
    }

    public Fraction minus(Fraction f) {
        return new Fraction(this.numerator * f.denominator - f.numerator * this.denominator,
                this.denominator * f.denominator);
    }

    public Fraction minus(int num) {
        return new Fraction(this.numerator - this.denominator * num, this.denominator);
    }

    public Fraction mult(Fraction f) {
        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }

    public Fraction mult(int num) {
        return new Fraction(this.numerator * num, this.denominator);
    }

    public Fraction div(Fraction f) {
        return new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
    }

    public Fraction div(int num) {
        return new Fraction(this.numerator, this.denominator * num);
    }

    public void simplify() {
        int gcd = Fraction.gcd(numerator, denominator);

        if (gcd > 1) {
            numerator /= gcd;
            denominator /= gcd;
        }
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    @Override
    public String toString() {
        return denominator == 1 ? String.valueOf(numerator) : numerator + "/" + denominator;
    }
}
