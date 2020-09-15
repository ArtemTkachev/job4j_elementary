package ru.job4j.oop;

public class Student {
    public void song() {
        System.out.println("I believe I can fly");
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public static void main(String[] args) {
        Student vlad = new Student();
        vlad.music();
        vlad.music();
        vlad.music();
        vlad.song();
        vlad.song();
        vlad.song();
    }
}
