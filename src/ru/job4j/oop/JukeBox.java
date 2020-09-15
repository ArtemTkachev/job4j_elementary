package ru.job4j.oop;

public class JukeBox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Какая осень в лагерях");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        JukeBox jb = new JukeBox();
        jb.music(1);
        jb.music(2);
        jb.music(0);
    }
}
