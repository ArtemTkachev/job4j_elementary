package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double pay = amount;
        do {
            pay = pay + pay * (percent / 100) - salary;
            year++;
        } while (pay > 0);
        return year;
    }
}
