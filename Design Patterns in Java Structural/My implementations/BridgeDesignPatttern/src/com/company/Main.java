package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee first = new Teacher(new TeachingJob());
        first.whatIsMyJob();
        Employee second = new SoftwareEngineer(new ITJOB());
        second.whatIsMyJob();
    }
}

/**
 *
 * Ai 2 layere de abstractizare :
 * 1)Employee(Engineer,teacher,cooker...)
 * 2)Jobul(It,teaching,cooking..)
 */