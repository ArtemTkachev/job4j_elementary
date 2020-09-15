package ru.job4j.oop;

public class Wolf {
    private String name = "Wolf";

    public void tryEat(Ball ball) {
        System.out.println(this.name + ": Fail! " + ball.getName() + ": " + ball.speakNice());
    }
}
