package ru.job4j;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                sum += hours[i] > 8 ? (hours[i] - 8) * 15 + 80 : hours[i] * 10;
            } else {
                sum += hours[i] * 20;
            }
        }
        return sum;
    }
}
