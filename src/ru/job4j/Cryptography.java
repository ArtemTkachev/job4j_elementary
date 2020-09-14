package ru.job4j;

public class Cryptography {
    public static String code(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.length() == 0) {
            return "empty";
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.length() - i > 4) {
                sb.setCharAt(i, '#');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(code("123453"));
        System.out.println(code(""));
        System.out.println(code("123"));
    }
}
