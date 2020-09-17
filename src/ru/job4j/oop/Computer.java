package ru.job4j.oop;

public class Computer {
    private int numberID;
    private ProfProgram[] profPrograms;

    public int getNumberID() {
        return numberID;
    }

    public ProfProgram[] getProfProgram() {
        return profPrograms;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public void setProfProgram(ProfProgram[] profPrograms) {
        this.profPrograms = profPrograms;
    }
}