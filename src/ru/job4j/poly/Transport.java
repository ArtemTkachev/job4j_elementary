package ru.job4j.poly;

public interface Transport {
    void go();

    void passengers(int numbPass);

    double fuel(double amountFuel);
}
