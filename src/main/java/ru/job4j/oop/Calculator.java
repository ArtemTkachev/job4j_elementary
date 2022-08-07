package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int minus(int z) {
        return x - z;
    }

    public double divide(int i) {
        return i / x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public double sumAllOperation(int k) {
        return sum(k) + multiply(k) + minus(k) + divide(k);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(10);
        System.out.println(resultSum);
        int resultMinus = Calculator.minus(10);
        System.out.println(resultMinus);
        Calculator calculator = new Calculator();
        int rslMult = calculator.multiply(5);
        System.out.println(rslMult);
        double rslDivide = calculator.divide(5);
        System.out.println(rslDivide);
        System.out.println(calculator.sumAllOperation(1));
    }
}
