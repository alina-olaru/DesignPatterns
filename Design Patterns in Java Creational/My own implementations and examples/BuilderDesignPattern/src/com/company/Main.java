package com.company;

public class Main {
//
//    private  String name;
//    private  Integer Age;
//    private  String University;
//    private  String nameOfFirstKid;
//    private  String currentJob;

    public static void main(String[] args) {
	// write your code here
        Person.Builder builder = new Person.Builder();
          builder.Age(21).currentJob("student").name("Alina").University("FMI");
          Person me = builder.buildPerson();
        System.out.println(me);

        builder = new Person.Builder();
        builder.name("Cornelia").nameOfFirstKid("George").Age(53);
        Person mom=builder.buildPerson();
        System.out.println(mom);
    }

}
