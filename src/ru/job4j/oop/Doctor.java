package ru.job4j.oop;

import java.time.LocalDate;

public class Doctor extends Profession {
    private Pacient[] pacients;

    public Doctor(String name, String surname, String education, LocalDate bithday, Pacient[] pacients) {
        super(name, surname, education, bithday);
        this.pacients = pacients;
    }

    public Pacient[] getPacients() {
        return pacients;
    }

    public void setPacients(Pacient[] pacients) {
        this.pacients = pacients;
    }

    public Diagnosis heal(Pacient pacient) {
        return pacient.getDiagnosis();
    }
}