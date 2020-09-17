package ru.job4j.oop;

import java.time.LocalDate;
import java.util.Arrays;

public class Engineer extends Profession {
    private Computer computer;

    public Engineer(String name, String surname, String education, LocalDate bithday, Computer computer) {
        super(name, surname, education, bithday);
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public boolean isProfProgramOnComp(Computer computer, ProfProgram profProgram) {
        return Arrays.asList(computer.getProfProgram()).contains(profProgram);
    }
}
