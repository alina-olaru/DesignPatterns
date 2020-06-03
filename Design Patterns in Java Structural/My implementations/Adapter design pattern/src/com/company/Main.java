package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        StudentClient client=new StudentClient();
        List<Student> students = client.getStudentsList();
        System.out.println(students);
    }
}
