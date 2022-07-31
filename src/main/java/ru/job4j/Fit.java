package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 185;
        double man = Fit.manWeight(height);
        System.out.println("Man 185 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 185 is " + woman);
    }

}
