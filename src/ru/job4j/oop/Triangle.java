package ru.job4j.oop;

import ru.job4j.condition.Point;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public double period(double ab, double bc, double ac) {
        return (ab + bc + ac) / 2;
    }

    public boolean exist(double ab, double bc, double ac) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public double area() {
        double ab = first.distance(second);
        double bc = second.distance(third);
        double ac = first.distance(third);
        double p = period(ab, bc, ac);
        if (this.exist(ab, bc, ac)) {
            return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return -1;
    }
}
