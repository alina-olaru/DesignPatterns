package com.company;

public class StudentAdapterStudentChanged implements Student {

    StudentChanged instance;

    public StudentAdapterStudentChanged(StudentChanged instance) {
        this.instance = instance;
    }


    @Override
    public String getName() {
        return instance.getName();
    }

    @Override
    public Integer getId() {
        return new Integer(instance.getId());
    }

    @Override
    public String getUniversity() {
        return instance.getUniversity();
    }

    @Override
    public String toString() {
        return "StudentAdapterStudentChanged{" +
                "instance=" + instance +
                '}';
    }
}
