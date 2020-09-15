package ru.job4j.oop;

public class Hare {
    private String name = "Hare";

    public void tryEat(Ball ball) {
        System.out.println(this.name + ": Fail! " + ball.getName() + ": " + ball.speakNice());
    }
}
