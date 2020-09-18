package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fio;
    private String group;
    private LocalDate dateRec;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getDateRec() {
        return dateRec;
    }

    public void setDateRec(LocalDate dateRec) {
        this.dateRec = dateRec;
    }
}
