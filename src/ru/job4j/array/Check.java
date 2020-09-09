package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean res = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                return false;
            }
        }
        return res;
    }
}
