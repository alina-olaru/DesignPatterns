package com.company;

public class StudentChanged {

    private String id;
    private String Name;
    private String University;

    public StudentChanged(String id, String name, String university) {
        this.id = id;
        Name = name;
        University = university;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }
}
