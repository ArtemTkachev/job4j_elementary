package ru.job4j.oop;

import java.time.LocalDate;

public class Programmer extends Engineer {

    public Programmer(String name, String surname, String education, LocalDate bithday, Computer computer) {
        super(name, surname, education, bithday, computer);
    }
}
