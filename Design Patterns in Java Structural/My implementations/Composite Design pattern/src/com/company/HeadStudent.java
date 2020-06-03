package com.company;

import java.util.ArrayList;
import java.util.List;


//composite – has leaf elements. It implements the base component methods and defines the child-related operations.
public class HeadStudent implements Student {


    private Integer grupa;
    private String name;
    //leaf elements.
    private List<Student> childStudents = new ArrayList<>();

    public HeadStudent(Integer grupa, String name, List<Student> childStudents) {
        this.grupa = grupa;
        this.name = name;
        this.childStudents = childStudents;
    }

    public HeadStudent(Integer grupa, String name) {
        this.grupa = grupa;
        this.name = name;
    }


    @Override
    public void printStudentName() {
        childStudents.forEach(Student::printStudentName);
    }

    public Integer getGrupa() {
        return grupa;
    }

    public void setGrupa(Integer grupa) {
        this.grupa = grupa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student s){
        childStudents.add(s);
    }
    public void removeStudent(Student s){
        childStudents.remove(s);
    }
}
