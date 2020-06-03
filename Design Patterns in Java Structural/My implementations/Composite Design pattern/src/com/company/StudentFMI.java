package com.company;

//leaf – implements the default behavior of the base component. It doesn't contain a reference to the other objects.
public class StudentFMI implements Student
{
    private Integer grupa;
    private String name;

    public StudentFMI(Integer grupa, String name) {
        this.grupa = grupa;
        this.name = name;
    }

    public StudentFMI(Integer grupa) {
        this.grupa = grupa;
    }

    @Override
    public void printStudentName() {
        System.out.println(this.getClass().getSimpleName());
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
}
