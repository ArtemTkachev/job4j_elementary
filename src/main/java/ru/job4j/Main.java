package ru.job4j;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        long l = 129;
        System.out.println((byte) l);
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(f + i);
        System.out.println(rsl);
        char c = 45000;
        float y = c;
        System.out.println(y);
        double d = 121.19;
        byte b = (byte) d;
        System.out.println(b);
        short s = 1500;
        char r = (char) s;
        double t = r;
        System.out.println(t);
    }
}