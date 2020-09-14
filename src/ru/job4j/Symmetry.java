package ru.job4j;

public class Symmetry {
    public static boolean check(int i) {
        String str = Integer.toString(i);
        for (int j = 0; j < str.length() / 2; j++) {
            if (str.charAt(j) != str.charAt(str.length() - j - 1)) {
                return false;
            }
        }
        return true;
    }
}
