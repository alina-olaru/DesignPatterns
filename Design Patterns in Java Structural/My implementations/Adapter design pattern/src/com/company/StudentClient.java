package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentsList(){

        List<Student> students = new ArrayList<>();
        Student student = new StudentDB(1,"Alina","FMI");
        students.add(student);

        /**
         * in cazul de mai jos-->eroare pt ca nu sunt aceleasi denumiri la campuri
         */
//        StudentNew studentNew=new StudentNew(2,"Andrei","Info");
//        students.add(studentNew);
        StudentNew studentNew=new StudentNew(2,"Andrei","Info");
        students.add(new StudentAdapterStudentNew(studentNew));

        /**
         * in cazul de mai jos-->eroare pt ca nu sunt aceleasi tipuri de date la campuri
         */
        StudentChanged studentChanged=new StudentChanged("2","Andrei","Info");
        students.add(new StudentAdapterStudentChanged(studentChanged));

        System.out.println(students.size());

        return students;
    }
}
