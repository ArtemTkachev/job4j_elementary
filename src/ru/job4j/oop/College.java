package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        StudentBachelor studentBachelor = new StudentBachelor();
        Freshman freshman = new Freshman();
        StudentBachelor freshStudent = freshman;
        Object objStudent = freshStudent;
    }
}
