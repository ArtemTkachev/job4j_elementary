package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");

        int in1 = 140;
        int out1 = Converter.rubleToEuro(in1);
        int expected1 = 2;
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euro. Test result: " + passed1);

        int in2 = 180;
        int out2 = Converter.rubleToDollar(in2);
        int expected2 = 3;
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3 dollars. Test result: " + passed2);
    }

}

