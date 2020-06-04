package com.company;

public class Person {

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", University='" + University + '\'' +
                ", nameOfFirstKid='" + nameOfFirstKid + '\'' +
                ", currentJob='" + currentJob + '\'' +
                '}';
    }

    public static class Builder{

        private  String name;
        private  Integer Age;
        private  String University;
        private  String nameOfFirstKid;
        private  String currentJob;

        public Builder() {
        }

        public Person buildPerson(){
            return new Person(this);
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder Age(Integer age){
            this.Age = age;
            return this;
        }

        public Builder University(String university){
            this.University = university;
            return this;
        }

        public Builder nameOfFirstKid(String nameOfFirstKid){
            this.nameOfFirstKid = nameOfFirstKid;
            return this;
        }

        public Builder currentJob(String currentJob){
            this.currentJob = currentJob;
            return this;
        }


    }

    private final String name;
    private final Integer Age;
    private final String University;
    private final String nameOfFirstKid;
    private final String currentJob;

    public Person(String name, Integer age, String university, String nameOfFirstKid, String currentJob) {
        this.name = name;
        Age = age;
        University = university;
        this.nameOfFirstKid = nameOfFirstKid;
        this.currentJob = currentJob;
    }
    public Person(Builder builder){
        this.Age = builder.Age;
        this.currentJob= builder.currentJob;
        this.University=builder.University;
        this.name=builder.name;
        this.nameOfFirstKid=builder.nameOfFirstKid;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return Age;
    }

    public String getUniversity() {
        return University;
    }

    public String getNameOfFirstKid() {
        return nameOfFirstKid;
    }

    public String getCurrentJob() {
        return currentJob;
    }
}
