package com.company;

public class Main {

    public static void main(String[] args) {
	Student studentFMI = new StudentFMI(253,"Alina");
	Student studentInfo = new StudentInfo(344,"Alexandra");
	HeadStudent headStudent = new HeadStudent(111,"Head");
	//client – has access to the composition elements by using the base component object.
	headStudent.addStudent(studentFMI);
	//using the base component object.
	headStudent.addStudent(studentInfo);
	//using the base component object.
	headStudent.printStudentName();
    }
}
