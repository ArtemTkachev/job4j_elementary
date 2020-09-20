package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matchQuant = 11;
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11 спичек: ");
        String[] gamers = new String[]{"Первый игрок", "Второй игрок"};
        int value = 0;
        while (matchQuant > 0) {
            for (String gamer : gamers) {
                System.out.println(gamer + ", возьмите спички от 1 до 3: ");
                value = Integer.parseInt(input.nextLine());
                if (value >= 1 && value <= 3) {
                    if (value > matchQuant) {
                        System.out.println("Вы не можете взять больше спичек, чем есть на столе!");
                        continue;
                    }
                    matchQuant -= value;
                    if (matchQuant > 0) {
                        System.out.println("Осталось " + matchQuant + " спичек");
                    } else {
                        System.out.println(gamer + ", вы выиграли!");
                        break;
                    }
                } else {
                    System.out.println("Вы ввели число не в диапазоне от 1 до 3!");
                }
            }
        }
    }
}
