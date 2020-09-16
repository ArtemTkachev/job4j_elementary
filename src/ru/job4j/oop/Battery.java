package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return this.load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.setLoad(another.getLoad() + this.getLoad());
        this.setLoad(0);
    }

    public static void main(String[] args) {
        Battery first = new Battery(20);
        Battery second = new Battery(30);
        System.out.println("first : " + first.getLoad() + " second : " + second.getLoad());
        first.exchange(second);
        System.out.println("first : " + first.getLoad() + " second : " + second.getLoad());
    }
}