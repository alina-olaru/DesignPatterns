package com.company;

public class StudentNew {

    private Integer idStudent;
    private String NameofStudent;
    private String UniversityofStudent;

    public StudentNew(Integer idStudent, String nameofStudent, String universityofStudent) {
        this.idStudent = idStudent;
        NameofStudent = nameofStudent;
        UniversityofStudent = universityofStudent;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameofStudent() {
        return NameofStudent;
    }

    public void setNameofStudent(String nameofStudent) {
        NameofStudent = nameofStudent;
    }

    public String getUniversityofStudent() {
        return UniversityofStudent;
    }

    public void setUniversityofStudent(String universityofStudent) {
        UniversityofStudent = universityofStudent;
    }
}
