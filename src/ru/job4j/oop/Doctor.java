package ru.job4j.oop;

import java.time.LocalDate;

public class Doctor extends Profession {
    private String name;
    private String surname;
    private String education;
    private LocalDate bithday;
    private Pacient[] pacients;

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