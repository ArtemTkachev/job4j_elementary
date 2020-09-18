package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Петров Петр Петрович");
        student.setGroup("A111");
        student.setDateRec(LocalDate.of(1987, 8, 19));
        System.out.println("FIO: " + student.getFio() + System.lineSeparator() +
                           "group: " + student.getGroup() + System.lineSeparator() +
                           "dataOfRec: " + student.getDateRec().toString());
    }
}
