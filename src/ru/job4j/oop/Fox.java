package ru.job4j.oop;

public class Fox {
    private String name = "Fox";

    public void tryEat(Ball ball) {
        System.out.println(this.name + ": Caught! " + ball.getName() + ": " + ball.speakNotNice());
    }
}
