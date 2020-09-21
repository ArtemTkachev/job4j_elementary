package ru.job4j.poly;

public class Bus implements Transport {
    private double priceForLiterFuel = 40.00;

    @Override
    public void go() {
        System.out.println("Go!");
    }

    @Override
    public void passengers(int numbPass) {
        System.out.println("Number of passengers: " + numbPass);
    }

    @Override
    public double fuel(double amountFuel) {
        return amountFuel * priceForLiterFuel;
    }
}
