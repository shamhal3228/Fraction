package ru.samsung.itacademy;

public class Main {

    public static void main(String[] args) {
        Fraction fraction = new Fraction(-5, -15);
        fraction.printFract();
        Fraction fraction1= new Fraction(14, 221);
        fraction.sumFraction(fraction1, fraction).printFract();








        /*fraction
                .incNumerator()
                .incNumerator()
                .incNumerator()
                .incNumerator()
                .incNumerator();*/


        /*Number[] num={new Integer(10), 30, 3.14f, 7.5};
        for (Number n:num)
            printNum(n);

        printNum(new Integer(1));
        printNum(10);
        printNum(3.14f);
        printNum(7.5);*/
    }




    /*static void printNum(Integer i){
        System.out.println("Integer= "+i);
    }

    static void printNum(int i){
        System.out.println("Int= "+i);
    }

    static void printNum(float i){
        System.out.println("float= "+i);
    }

    static void printNum(Number i){
        System.out.println("Number= "+i);
    }*/
}
