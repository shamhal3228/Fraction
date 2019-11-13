package ru.samsung.itacademy;

public class Fraction {

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenomenator() {
        return denomenator;
    }


    private int numerator; //числитель
    private int denomenator = 1; //знаменатель

    Fraction(int numerator, int denomenator) {
        this.numerator = numerator * (denomenator < 0 ? (-1) : 1);
        if (denomenator == 0) {
            System.err.println("Denominator can't be zero");
            return;
        } else
            this.denomenator = Math.abs(denomenator);
        this.normalization();
    }

    private int gcd(int numerator, int denomenator) {
        while (numerator != 0 && denomenator != 0) {
            if (numerator > denomenator)
                numerator %= denomenator;
            else denomenator %= numerator;
        }
        return denomenator + numerator;
    }

    private void normalization() {
        int n = gcd(Math.abs(numerator), Math.abs(denomenator));
        numerator /= n;
        denomenator /= n;
    }

    public void printFract() {
        System.out.println(this.toString());
    }


    public boolean properFunction() {
        return (Math.abs(numerator) < denomenator ? true : false);
    }

    public int isIntegerPart() {
        return (numerator / denomenator);
    }

    public Fraction fractionalPart() {
        return new Fraction(numerator % denomenator, denomenator);
    }

    public double toDecemitialForm() {
        return (double) (numerator / denomenator);
    }

    @Override
    public String toString() {
        return new String(numerator + "/" + denomenator);
    }

    public Fraction sumFraction(Fraction obj) {
        return new Fraction(this.numerator * obj.denomenator + this.denomenator * obj.numerator, this.denomenator * obj.denomenator);
    }

    public static Fraction sumFraction(Fraction obj1, Fraction obj2) {
        return new Fraction(obj2.numerator * obj1.denomenator + obj2.denomenator * obj1.numerator, obj2.denomenator * obj1.denomenator);
    }
}


    /* Fraction incNumerator(){
        numerator++;
        return this;
    }*/

