package com.company;

public class StudentAdapterStudentNew implements Student {

    private StudentNew instance;

    public StudentAdapterStudentNew(StudentNew instance) {
        this.instance = instance;
    }

    @Override
    public String getName() {
        return instance.getNameofStudent();
    }

    @Override
    public Integer getId() {
        return instance.getIdStudent();
    }

    @Override
    public String getUniversity() {
        return instance.getUniversityofStudent();
    }

    public StudentNew getInstance() {
        return instance;
    }

    public void setInstance(StudentNew instance) {
        this.instance = instance;
    }

    @Override
    public String toString() {
        return "StudentAdapterStudentNew{" +
                "instance=" + instance.getNameofStudent() +
                '}';
    }
}
