package ru.job4j.oop;

public class Ball {
    private String name = "Ball";

    public String getName() {
        return this.name;
    }

    public String speakNice() {
        return "Nice try, but no";
    }

    public String speakNotNice() {
        return "Not good";
    }
}