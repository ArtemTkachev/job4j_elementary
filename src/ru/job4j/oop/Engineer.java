package ru.job4j.oop;

import java.time.LocalDate;
import java.util.Arrays;

public class Engineer extends Profession {
    private String name;
    private String surname;
    private String education;
    private LocalDate bithday;
    private Computer computer;

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
