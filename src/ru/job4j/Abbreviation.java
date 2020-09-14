package ru.job4j;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sa = s.split(" ");
        for (String i : sa) {
            sb.append(i.charAt(0));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(collect("Мама Мыла Раму"));
    }
}