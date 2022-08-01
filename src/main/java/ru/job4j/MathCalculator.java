package ru.job4j;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second) + divide(first, second);
    }

    public static double sumAndMultiplyAndSubtractAndDivide(double first, double second) {
        return sum(first, second) + multiply(first, second) + subtract(first, second) + divide(first, second);
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubtractAndDivide(10, 20));
    }
}
