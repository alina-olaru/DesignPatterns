package com.company;

public class StudentDB implements Student {

    private Integer id;
    private String Name;
    private String University;

    public StudentDB(Integer id, String name, String university) {
        this.id = id;
        Name = name;
        University = university;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getUniversity() {
        return this.University;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", University='" + University + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setUniversity(String university) {
        University = university;
    }
}
