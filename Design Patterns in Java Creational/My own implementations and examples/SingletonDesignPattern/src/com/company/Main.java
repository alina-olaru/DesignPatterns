package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**if you run commented code,you'll observe
         * that there can exists 2 or even more
         * instance of same object
         * and we don't want that--->singleton pattern
         */
//        Student s1 = new Student("Alina Olaru",21);
//        Student s2=new Student("Irina",20);
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(s1);
//        studentList.add(s2);
//        G253 g1=new G253(studentList);
//        G253 g12=new G253(studentList);
//        System.out.println(g1);
//        System.out.println(g12);

        Student s1 = new Student("Alina Olaru",21);
        Student s2=new Student("Irina",20);
        Student s3=new Student(" Andreeaa",20);
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        System.out.println(studentList.size());
        G253 g1=G253.getInstance(studentList);
        System.out.println(g1.students);
        studentList.add(s3);
        G253 g12=G253.getInstance(studentList);
        System.out.println(g1.students);
        System.out.println(g12.students);
        /**
         * As you can see,if you modify somehow one instance , all the objects
         * will suffer that modification.
         */
    }
}
