package com.company;

public class Student {
    protected String nume;
    protected Integer nota;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Student(String nume, Integer nota) {
        this.nume = nume;
        this.nota = nota;
    }

    public Student(Integer nota) {
        this.nota = nota;
    }
}
