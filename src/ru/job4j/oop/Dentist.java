package ru.job4j.oop;

import java.time.LocalDate;

public class Dentist extends Doctor {

    public Dentist(String name, String surname, String education, LocalDate bithday, Pacient[] pacients) {
        super(name, surname, education, bithday, pacients);
    }
}
